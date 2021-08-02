package com.mastek.springboot.bankapp.service;

import java.util.List;

import com.mastek.springboot.bankapp.entity.BankAccount;

public interface BankAccountService {

	public List<BankAccount> findAll();
	
	public BankAccount findById(int theId);
	
	public void save(BankAccount theBankAccount);
	
	public void deleteById(int theId);
	
}
