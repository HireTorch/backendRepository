package com.project.htproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.htproject.entity.CandidateHscSscAcademics;
import com.project.htproject.repository.CandidateHscSscAcademicsRepository;

public class AcademicService implements IAcademicService {

	@Autowired
    private CandidateHscSscAcademicsRepository academicRepository;

	public List<CandidateHscSscAcademics> getAllAcademics() {
		List<CandidateHscSscAcademics> allAcademics = academicRepository.findAll();
		return allAcademics;
	}

}
