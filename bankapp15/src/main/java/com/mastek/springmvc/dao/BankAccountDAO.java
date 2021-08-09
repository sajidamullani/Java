package com.mastek.springmvc.dao;

import java.util.List;

import com.mastek.springmvc.model.BankAccount;


public interface BankAccountDAO {

	public void addBankAccount(BankAccount bankAccount);

	public List<BankAccount> getAllBankAccounts();

	public void deleteBankAccount(Integer bankAccountId);

	public BankAccount updateBankAccount(BankAccount bankAccount);

	public BankAccount getBankAccount(int bankAccountid);
	



}
