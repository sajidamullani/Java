package com.mastek.bankapp.model;

import javax.persistence.*;  

@Entity  
@Table(name="savingtps")  
@PrimaryKeyJoinColumn(name="AccNo")  

public class SalaryAccount extends BankAccount {
	
	@Column(name="balance")    
	private double balance;

	public SalaryAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}  

	
	
	
}
