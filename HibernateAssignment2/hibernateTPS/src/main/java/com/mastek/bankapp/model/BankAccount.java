package com.mastek.bankapp.model;
import javax.persistence.*;  

@Entity  
@Table(name = "bankapptps")  
@Inheritance(strategy=InheritanceType.JOINED)  
  
public class BankAccount {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	      
	@Column(name = "accno")  
	private int accNo;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int accNo) {
		super();
		this.accNo = accNo;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	} 
	
	
}
