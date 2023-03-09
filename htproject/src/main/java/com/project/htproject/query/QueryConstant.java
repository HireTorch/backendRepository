package com.project.htproject.query;

public class QueryConstant {
	public static final String UPDATE_CANDIDATE = " update Candidate c set c.firstName = :firstName, c.middleName = :middleName,"
			+ " c.lastName = :lastName, c.dob= :dob, c.gender = :gender, c.candidateEmail = :candidateEmail, "
			+ " c.candidateAddhar = :candidateAddhar, c.candidateUserName = :candidateUserName, c.candidatePassword = :candidatePassword  where c.candidateID = :getcandidateId";


}
