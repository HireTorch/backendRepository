package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.CandidateDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Address;
import com.project.htproject.entity.Candidate;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.response.LoginMessage;
import com.project.htproject.response.UpdateResponse;
import com.project.htproject.service.CandidateService;


@RestController
@CrossOrigin
@RequestMapping("/home/")
public class candidateController {

	@Autowired
	public CandidateService candidateService;

	@GetMapping("/Candidate-All")
	public List<Candidate> getAllcandidate() {
		List<Candidate> allCandidates = candidateService.getAllCandidate();
		return allCandidates;
	}
	
	
	@GetMapping("candidate/{candidate_Id}")
	public Candidate getOneCandidate(@PathVariable("candidate_Id") int candidateid)
	{
		Candidate getCandidate = candidateService.getOneCandidate(candidateid);
		return getCandidate;
 	}
	//================================================================
	@PostMapping("/save")
	public String saveCandidate (@RequestBody CandidateDto candidateDto)
	{
		String id = candidateService.addCandidate(candidateDto);
		return id;
	}
	//===============================================================
	@DeleteMapping("/delete/{candidate_Id}")
	public  DeleteResponse deleteOneCandidate (@PathVariable("candidate_Id") Long candidateId)
	{
		DeleteResponse response = candidateService.deleteOneCandidate(candidateId);
		return response;
	}
	
	
	@PostMapping("update/{candidate_Id}")
	public UpdateResponse updateOneCandidate(@RequestBody CandidateDto candidateDto ,
			                                                           @PathVariable("candidate_Id") Long candidateId)
	{
		UpdateResponse response = candidateService.updateOneCandidate(candidateDto,candidateId);
		return response;
	}
	
	//=============================================================================
	@PostMapping("/login")
	public ResponseEntity<?> loginCandidate(@RequestBody LoginDto loginDto)
	{
		LoginMessage loginMessage = candidateService.loginCandidate(loginDto);
		 return ResponseEntity.ok(loginMessage);
	}
	//=============================================================================
	@PostMapping("/address/save")
	public String saveCandidateAddressss (@RequestBody CandidateDto candidateDto , 
			                                                 @RequestBody Address address )
	{
		String id = candidateService.addCandidate(candidateDto,address);
		return id;
	}
}
