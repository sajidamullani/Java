package com.mastek.bankapp.model;

import javax.persistence.*;

@Entity
@Table(name = "bankapptch")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "bankaccount")

public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "accno")
	private int accNo;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public BankAccount(int accNo) {
		super();
		this.accNo = accNo;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
