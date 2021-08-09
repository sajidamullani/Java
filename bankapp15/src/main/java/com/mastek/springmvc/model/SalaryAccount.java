package com.mastek.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

import com.mastek.springmvc.models.util.MinBalException;
@Entity
@DiscriminatorValue("salary")
public class SalaryAccount extends BankAccount {
	private static final long serialVersionUID = 1L;
	private final static double MIN_BAL = 0.00;

	public SalaryAccount() {
		super();
	}

	public SalaryAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	public SalaryAccount(String accName, double balance) {
		super(accName, balance);
	}


	public String withdraw(double amount) throws Exception {
		final double diff = this.getBalance() - amount;
		if (diff > MIN_BAL) {
			this.setBalance(diff);
		} else {
			throw new MinBalException("Please enter amount less than " + this.getBalance());
		}
		return amount + " Debited from account!";
	}


	public String deposit(double amount) throws Exception {
		this.setBalance(this.getBalance() + amount);
		return amount + " Credited to account!";
	}

}
