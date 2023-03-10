package com.project.htproject.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.project.htproject.entity.Candidate;
import com.project.htproject.query.QueryConstant;

public interface CandidateRepositoryForInt {

	@Modifying //Mandatory in order to support any DML operation
	@Query(QueryConstant.UPDATE_CANDIDATE)
	void updateCandidate(Long getcandidateId, String firstName, String middleName, String lastName, LocalDate dob,
			String gender, String candidateEmail, String candidateAddhar, String candidateUserName,
			String candidatePassword);

	Optional<Candidate> findById(int candidateid);

	void deleteById(Integer candidateId);
     
//	//@jakarta.transaction.Transactional //Causes to start the transaction when the execution begins and end when it ends
//	//@Modifying //Mandatory in order to support any DML operation
//	@Query("update Candidate c set c.firstName = :firstName, c.middleName = :middleName,"
//			+ " c.lastName = :lastName, c.dob= :dob, c.gender = :gender, c.candidateEmail = :candidateEmail, "
//			+ "c.candidateAddhar = :candidateAddhar, c.candidateUserName = :candidateUserName, c.candidatePassword = :candidatePassword  where c.candidateId = :candidateId")
//	void updateCandidate(Long candidateID, String firstName, String middleName, String lastName, LocalDate dob,
//			String gender, String candidateEmail, String candidateAddhar, String candidateUserName,
//			String candidatePassword);
}
