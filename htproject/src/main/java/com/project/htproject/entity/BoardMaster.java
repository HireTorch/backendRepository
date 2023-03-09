package com.project.htproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "boards_master")
public class BoardMaster {
	
	@Id
    @Column(name = "board_id")
	private Integer boardId;
    @Column(name = "board_name")
	private String boardName;
    
    
    @OneToOne(mappedBy = "board")
    @JsonIgnore
    private CandidateHscSscAcademics academics;
    

	public BoardMaster() {
		super();
	}

	public Integer getBoardId() {
		return boardId;
	}

	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	
	

	public CandidateHscSscAcademics getAcademics() {
		return academics;
	}

	public void setAcademics(CandidateHscSscAcademics academics) {
		this.academics = academics;
	}

	@Override
	public String toString() {
		return "BoardsMaster [boardId=" + boardId + ", boardName=" + boardName + "]";
	}


}
