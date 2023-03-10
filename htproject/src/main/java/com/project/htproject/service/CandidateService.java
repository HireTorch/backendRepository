package com.project.htproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.htproject.dto.CandidateDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Address;
import com.project.htproject.entity.Candidate;
import com.project.htproject.repository.CandidateRepository;
import com.project.htproject.repository.CandidateRepositoryForInt;
import com.project.htproject.repository.CandidateRepositoryForUpdate;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.response.LoginMessage;
import com.project.htproject.response.UpdateResponse;
import java.util.Optional;
import java.util.Optional;

@Service
public class CandidateService implements ICandidateService {

	
	@Autowired
	public CandidateRepository repo;
	
	@Autowired
	private CandidateRepositoryForInt candidateRepositoryForInt;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private CandidateRepositoryForUpdate candidateRepositoryForUpdate; 

	
	public List<Candidate> getAllCandidate() {
		List<Candidate> allCandidate = repo.findAll();
		return allCandidate;
	}
	
	@Override
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
		String msg=" ";
		Candidate candidate1 = repo.findByEmail(loginDto.getEmail());
		if(candidate1 != null) {
			String password = loginDto.getPassword();
			String encodedPassword = candidate1.getCandidatePassword();
			Boolean isPasswordRight = passwordEncoder.matches(password, encodedPassword);
			if(isPasswordRight) {
				Optional<Candidate> candidate = repo.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
				if(candidate.isPresent()) {
					return new LoginMessage("Login Successful",true,candidate1.getCandidateID());
				} else {
					return new LoginMessage("Login Failed", false,candidate1.getCandidateID());
				}
			} else {
				return new LoginMessage("Password Not Matched ", false,candidate1.getCandidateID());
			}
		} else {
			return new LoginMessage("Email not Exist", false,candidate1.getCandidateID());
		}	
	}
	
	public Candidate getOneCandidate(Integer candidateid) {
		Optional<Candidate> candidateOpt = candidateRepositoryForInt.findById(candidateid);
		Candidate candidate = candidateOpt.get();
		return candidate;
	}
	
	public DeleteResponse deleteOneCandidate(Integer candidateId) {
		String name = getOneCandidate(candidateId).getFirstName();
		   candidateRepositoryForInt.deleteById(candidateId);
		return new DeleteResponse("deleted Successfully ", name);
	
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
	
	public String addCandidate(CandidateDto candidateDto, Address address) {
		// TODO Auto-generated method stub
		return null;
	}
	
}



