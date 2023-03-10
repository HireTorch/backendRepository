package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.entity.CandidateHscSscAcademics;
import com.project.htproject.service.AcademicService;

@RestController
public class CandidateHscSscAcademicsController {

	@Autowired
	 private AcademicService  academicService;
		@GetMapping("/Academics")
		public List<CandidateHscSscAcademics> getAllAcademics() {
			List<CandidateHscSscAcademics> allAcademics = academicService.getAllAcademics();
			return allAcademics;
		}
}
