package com.project.htproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.htproject.entity.Company;

public interface CompanyRepositoryByLong extends JpaRepository<Company,Long>{

}
