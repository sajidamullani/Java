package com.mastek.bankapp.model;
import javax.persistence.Column;  
import javax.persistence.DiscriminatorValue;  
import javax.persistence.Entity;  
  
@Entity  
@DiscriminatorValue("salarytch")  
public class SalaryAccount extends BankAccount {
	@Column(name="balance")    
	private double balance;

	public SalaryAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(int accNo, double balance) {
		super(accNo);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	

	
}
