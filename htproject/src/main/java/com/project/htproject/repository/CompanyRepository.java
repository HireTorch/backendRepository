package com.project.htproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.htproject.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,String> {

	@Query("select c from Company c where c.companyEmail =:email")
	Company findByEmail(String email);
    
	
	@Query("select c from Company c where c.companyEmail =:email and c.companyPassword=:encodedPassword")
	Optional<Company> findOneByEmailAndPassword(String email, String encodedPassword);

}
