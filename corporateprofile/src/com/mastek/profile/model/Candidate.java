package com.mastek.profile.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candidate extends JobDetail implements IGetInformation{
	
	private String candidateName;
	private String educationQulification;
	private String skill;
	private String certification;
	 List<JobDetail> list = new ArrayList<JobDetail>();
	 
	 Scanner sc=new Scanner(System.in);
	public Candidate() {
		super();
		
	}
	JobDetail Jobdetail=new JobDetail();
	public Candidate(String candidateName, String educationQulification, String skill, String certification,
			List<JobDetail> list, Scanner sc) {
		super();
		this.candidateName = candidateName;
		this.educationQulification = educationQulification;
		this.skill = skill;
		this.certification = certification;
		this.list = list;
		this.sc = sc;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getEducationQulification() {
		return educationQulification;
	}
	public void setEducationQulification(String educationQulification) {
		this.educationQulification = educationQulification;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public List<JobDetail> getList() {
		return list;
	}
	public void setList(List<JobDetail> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Candidate [candidateName=" + candidateName + ", educationQulification=" + educationQulification
				+ ", skill=" + skill + ", certification=" + certification + ", list=" + list + "]";
	}
	public void getInformation() {
		System.out.println("Enter candidate name:");
		candidateName=sc.nextLine();
		System.out.println("Enter candidate education Qulification:");
		educationQulification=sc.nextLine();
		System.out.println("Enter candidate Skils:");
		skill=sc.nextLine();
		System.out.println("Enter candidate certification:");
		certification=sc.nextLine();
		System.out.println("------------------------------------------------------------------------------------")	;	
		System.out.println("Job Discrption");
		System.out.println("------------------------------------------------------------------------------------")	;	
		System.out.println("Enter job Name:");
		Jobdetail.setJobname(sc.nextLine());
		System.out.println("Enter job Role:");
		Jobdetail.setRole(sc.nextLine());
		System.out.println("Enter job yearOfExperience:");
		Jobdetail.setYearOfExperience(sc.nextFloat());
		System.out.println(Jobdetail);
		list.add(Jobdetail);
	}
	 
	 
}
