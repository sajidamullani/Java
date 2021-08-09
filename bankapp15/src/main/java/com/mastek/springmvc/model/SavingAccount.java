package com.mastek.springmvc.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.mastek.springmvc.models.util.MinBalException;
@Entity
@DiscriminatorValue("saving")
public class SavingAccount extends BankAccount {
	private static final long serialVersionUID = 1L;

	private final static double MIN_BAL = 10000.00;

	public SavingAccount() {

	}

	public SavingAccount(String accName, double balance) {
		super(accName, balance);

	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);

	}

	public String withdraw(double amount) throws Exception {
		final double diff = this.getBalance() - amount;
		if (diff >= MIN_BAL) {
			this.setBalance(diff);
		} else {
			throw new MinBalException("Please Maintain Minumum Balance");
		}
		return amount + " Debited from account!";
	}

	public String deposit(double amount) throws Exception {
		this.setBalance(this.getBalance() + amount);
		return amount + " Credited to account!";
	}

}
