package com.project.htproject.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name ="job_Deatils")
public class jobDeatils {
	
	
	@Id
	@SequenceGenerator(name = "Job_seq" , initialValue = 31000)
	@GeneratedValue(generator = "Job_seq")
	private Integer jobId ;
	private String jobTitle;
	private String JobDescription;
	private Double minPakchage;
	private Double maxPackage;
	private String location;
	private String skillSetRequirement;
	private Date postedDate;

	
	public jobDeatils() {
		// TODO Auto-generated constructor stub
	}


	public jobDeatils(String jobTitle, String jobDescription, Double minPakchage, Double maxPackage, String location,
			String skillSetRequirement, Date postedDate) {
		super();
		this.jobTitle = jobTitle;
		JobDescription = jobDescription;
		this.minPakchage = minPakchage;
		this.maxPackage = maxPackage;
		this.location = location;
		this.skillSetRequirement = skillSetRequirement;
		this.postedDate = postedDate;
	}


	public Integer getJobId() {
		return jobId;
	}


	public void setJobId(Integer jobId) {
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
		return "jobDeatils [jobId=" + jobId + ", jobTitle=" + jobTitle + ", JobDescription=" + JobDescription
				+ ", minPakchage=" + minPakchage + ", maxPackage=" + maxPackage + ", location=" + location
				+ ", skillSetRequirement=" + skillSetRequirement + ", postedDate=" + postedDate + "]";
	}
	
	

}
