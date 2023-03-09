package com.project.htproject.service;

import java.util.List;

import com.project.htproject.dto.CandidateDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Candidate;
import com.project.htproject.response.LoginMessage;


public interface ICandidateService {

    public List<Candidate> getAllCandidate();
	
	public String addCandidate(CandidateDto candidateDto);
	
	public LoginMessage loginCandidate(LoginDto loginDto);
	
}
