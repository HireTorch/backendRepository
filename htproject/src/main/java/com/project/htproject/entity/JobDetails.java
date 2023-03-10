package com.project.htproject.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "job_Details")
public class JobDetails {

	@Id
	@SequenceGenerator(name = "Job_seq", initialValue = 31000)
	@GeneratedValue(generator = "Job_seq")
	private Long jobId;
	private String jobTitle;
	@Column(length = 500)
	private String JobDescription;
	private Double minPakchage;
	private Double maxPackage;
	private String location;
	private String skillSetRequirement;
	private Date postedDate;
	private boolean isActive;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "company_Id")
	@JsonBackReference
	private Company company;

	public JobDetails() {
		// TODO Auto-generated constructor stub
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public JobDetails(String jobTitle, String jobDescription, Double minPakchage, Double maxPackage, String location,
			String skillSetRequirement, Date postedDate, boolean isActive) {
		super();
		this.jobTitle = jobTitle;
		JobDescription = jobDescription;
		this.minPakchage = minPakchage;
		this.maxPackage = maxPackage;
		this.location = location;
		this.skillSetRequirement = skillSetRequirement;
		this.postedDate = postedDate;
		this.isActive = isActive;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return JobDescription;
	}

	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}

	public Double getMinPakchage() {
		return minPakchage;
	}

	public void setMinPakchage(Double minPakchage) {
		this.minPakchage = minPakchage;
	}

	public Double getMaxPackage() {
		return maxPackage;
	}

	public void setMaxPackage(Double maxPackage) {
		this.maxPackage = maxPackage;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSkillSetRequirement() {
		return skillSetRequirement;
	}

	public void setSkillSetRequirement(String skillSetRequirement) {
		this.skillSetRequirement = skillSetRequirement;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	@Override
	public String toString() {
		return "JobDetails [jobId=" + jobId + ", jobTitle=" + jobTitle + ", JobDescription=" + JobDescription
				+ ", minPakchage=" + minPakchage + ", maxPackage=" + maxPackage + ", location=" + location
				+ ", skillSetRequirement=" + skillSetRequirement + ", postedDate=" + postedDate + "]";
	}

	public JobDetails(String jobTitle, String jobDescription, Double minPakchage, Double maxPackage, String location,
			String skillSetRequirement, Date postedDate, boolean isActive, Company company) {
		super();
		this.jobTitle = jobTitle;
		JobDescription = jobDescription;
		this.minPakchage = minPakchage;
		this.maxPackage = maxPackage;
		this.location = location;
		this.skillSetRequirement = skillSetRequirement;
		this.postedDate = postedDate;
		this.isActive = isActive;
		this.company = company;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
