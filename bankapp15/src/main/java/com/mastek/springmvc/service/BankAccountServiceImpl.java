package com.mastek.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mastek.springmvc.dao.BankAccountDAO;
import com.mastek.springmvc.model.BankAccount;
import com.mastek.springmvc.model.SalaryAccount;
import com.mastek.springmvc.model.SavingAccount;

@Service
@Transactional
public class BankAccountServiceImpl implements BankAccountService {
	@Autowired
	@Qualifier("bankAccountDAOImpl")
	private BankAccountDAO bankAccountDAO;

	@Transactional
	public void addBankAccount(BankAccount bankAccount) {
		bankAccountDAO.addBankAccount(bankAccount);
	}

	@Transactional
	public List<BankAccount> getAllBankAccounts() {
		return bankAccountDAO.getAllBankAccounts();
	}

	@Transactional
	public void deleteBankAccount(Integer bankAccountId) {
		bankAccountDAO.deleteBankAccount(bankAccountId);
	}
	@Transactional
	public BankAccount getBankAccount(int bankAccountid) {
		return bankAccountDAO.getBankAccount(bankAccountid);
	}

	@Transactional
	public BankAccount updateBankAccount(BankAccount bankAccount) {
		return bankAccountDAO.updateBankAccount(bankAccount);
	}
	
	public void setBankAccountDAO(BankAccountDAO bankAccountDAO) {
		this.bankAccountDAO = bankAccountDAO;
	}

//	@Override
//	public List<BankAccount> getAllEmployees() {
//		// TODO Auto-generated method stub
//		return bankAccountDAO.getAllBankAccounts();
//	}
//
//	@Override
//	public BankAccount getAccount(int bankAccountId) {
//		// TODO Auto-generated method stub
//		return bankAccountDAO.getBankAccount(bankAccountId);
//	}

	

	

}
	

	


