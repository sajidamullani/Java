package com.mastek.springboot.bankapp.dao;

import java.util.List;

import com.mastek.springboot.bankapp.entity.BankAccount;

public interface BankAccountDAO {

	public List<BankAccount> findAll();
	public BankAccount findById(int theId);
	
	public void save(BankAccount theBankAccount);
	
	public void deleteById(int theId);
}
