package com.mastek.springmvc.service;

import java.util.List;

import com.mastek.springmvc.model.BankAccount;
import com.mastek.springmvc.model.SalaryAccount;
import com.mastek.springmvc.model.SavingAccount;

public interface BankAccountService {


	public void addBankAccount(BankAccount bankAccount);

//	public List<BankAccount> getAllEmployees();

	public void deleteBankAccount(Integer bankAccountId);



	public BankAccount updateBankAccount(BankAccount bankAccount);

	public List<BankAccount> getAllBankAccounts();

	public BankAccount getBankAccount(int bankAccountId);

	


	

	
}
