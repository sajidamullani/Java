package com.mastek.bankapp.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("savingtch")
public class SavingAccount extends BankAccount {

	@Column(name = "accname")
	private String accName;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(String accName) {
		super();
		this.accName = accName;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

}
