package com.project.htproject.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.htproject.dto.CandidateDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Address;
import com.project.htproject.entity.Candidate;
import com.project.htproject.repository.CandidateRepository;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.response.LoginMessage;
import com.project.htproject.response.UpdateResponse;



public class CandidateService implements ICandidateService {

	
	@Autowired
	public CandidateRepository repo;
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	public List<Candidate> getAllCandidate() {
		List<Candidate> allCandidate = repo.findAll();
		return allCandidate;
	}
	public String addCandidate(CandidateDto candidateDto) {
		Candidate candidate = new Candidate(candidateDto.getFirstName(), candidateDto.getMiddleName(),
				candidateDto.getLastName(), candidateDto.getDob(), candidateDto.getGender(),
				candidateDto.getCandidateEmail(), candidateDto.getCandidateAddhar(),
				candidateDto.getCandidateUserName(), this.passwordEncoder.encode(candidateDto.getCandidatePassword()));
		repo.save(candidate);
		return candidate.getFirstName();
		
	        }
	@Override
	public LoginMessage loginCandidate(LoginDto loginDto) {
		// TODO Auto-generated method stub
		return null;
	}
	public Candidate getOneCandidate(int candidateid) {
		Optional<Candidate> candidateOpt = candidateRepositoryForLong.findById(candidateid);
		Candidate candidate = candidateOpt.get();
		return candidate;
	}
	public DeleteResponse deleteOneCandidate(Long candidateId) {
		// TODO Auto-generated method stub
		return null;
	}
	public UpdateResponse updateOneCandidate(CandidateDto candidateDto, Long candidateId) {
		// TODO Auto-generated method stub
		return null;
	}
	@PostMapping("/address/save")
	public String saveCandidateAddressss (@RequestBody CandidateDto candidateDto , 
			                                                 @RequestBody Address address )
	{
		String id = candidateService.addCandidate(candidateDto,address);
		return id;
	}
	
		}



