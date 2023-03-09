package com.project.htproject.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.htproject.entity.Candidate;

import jakarta.transaction.Transactional;


@Transactional
@Repository
public interface ICandidateRepositoryForInt extends JpaRepository<Candidate, Integer> {

	
	@Modifying //Mandatory in order to support any DML operation
	@Query(QueryConstant.UPDATE_CANDIDATE)
	void updateCandidate(Long getcandidateId, String firstName, String middleName, String lastName, LocalDate dob,
			String gender, String candidateEmail, String candidateAddhar, String candidateUserName,
			String candidatePassword);
     
}
