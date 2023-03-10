package com.project.htproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company_master")
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long companyId;
	@Column(name = "company_Name" )
	private String companyName;
	
	@Column(name = "company_Email" )
	private String companyEmail;
	
	@Column(name = "company_UserName" )
	private String companyUserName;
	
	@Column(name = "company_Password" )
	private String companyPassword;
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyUserName() {
		return companyUserName;
	}
	public void setCompanyUserName(String companyUserName) {
		this.companyUserName = companyUserName;
	}
	public String getCompanyPassword() {
		return companyPassword;
	}
	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}
	public Company(Long companyId, String companyName, String companyEmail, String companyUserName,
			String companyPassword) {
				this.companyId = companyId;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyUserName = companyUserName;
		this.companyPassword = companyPassword;
	}
	
	
	public Company(String companyName, String companyEmail, String companyUserName, String companyPassword) {
		super();
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyUserName = companyUserName;
		this.companyPassword = companyPassword;
	}
	public Company() {}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyEmail=" + companyEmail
				+ ", companyUserName=" + companyUserName + ", companyPassword=" + companyPassword + "]";
	}
}
