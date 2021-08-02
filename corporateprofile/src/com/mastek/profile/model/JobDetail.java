package com.mastek.profile.model;

public class JobDetail {

	protected String jobname;
	public String role;
	public float yearOfExperience;
	public JobDetail() {
		super();
		
	}
	public JobDetail(String jobname, String role, float yearOfExperiance) {
		super();
		this.jobname = jobname;
		this.role = role;
		this.yearOfExperience = yearOfExperiance;
	}
	@Override
	public String toString() {
		return "jobDetail [jobname=" + jobname + ", role=" + role + ", yearOfExperience=" + yearOfExperience + "]";
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(float yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	} 
	
	
}
