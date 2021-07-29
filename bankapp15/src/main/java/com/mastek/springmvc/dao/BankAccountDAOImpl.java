package com.mastek.springmvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mastek.springmvc.model.BankAccount;

@Repository
public class BankAccountDAOImpl implements BankAccountDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void addBankAccount(BankAccount bankAccount) {
		sessionFactory.getCurrentSession().saveOrUpdate(bankAccount);

	}

	@SuppressWarnings("unchecked")
	public List<BankAccount> getAllBankAccounts() {

		return sessionFactory.getCurrentSession().createQuery("from BankAccount").list();
	}

	public void deleteBankAccount(Integer bankAccountId) {
		BankAccount bankAccount = (BankAccount) sessionFactory.getCurrentSession().load(BankAccount.class, bankAccountId);
		if (null != bankAccount) {
			this.sessionFactory.getCurrentSession().delete(bankAccount);
		}

	}

	public BankAccount getBankAccount(int bankAccountid) {
		return (BankAccount) sessionFactory.getCurrentSession().get(BankAccount.class, bankAccountid);
	}

	public BankAccount updateBankAccount(BankAccount bankAccount) {
		sessionFactory.getCurrentSession().update(bankAccount);
		return bankAccount;
	}
	

}