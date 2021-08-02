package com.mastek.profile;

import java.util.Scanner;

import com.mastek.profile.model.Candidate;

public class ProfileApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Candidate candidate=new Candidate();
		candidate.getInformation();
		System.out.println(candidate);
	}

}
