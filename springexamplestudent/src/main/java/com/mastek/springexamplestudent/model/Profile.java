package com.mastek.springexamplestudent.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	 private Student student;
	 
	 @Autowired
	   @Qualifier("student1")
	   public void setStudent(Student student) {
		   this.student=student;
	   }
	  
	   public Profile(){
	      System.out.println("Inside Profile constructor." );
	   }
	 
	   public Student getStudent() {
		return student;
		   
	   }

	public void printAge() {
		System.out.println("Age : " + student.getAge() );
	}

	public void printName() {
		System.out.println("Name : " + student.getName() );
		
	}
}
