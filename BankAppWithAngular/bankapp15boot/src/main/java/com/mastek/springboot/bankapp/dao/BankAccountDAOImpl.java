package com.mastek.springboot.bankapp.dao;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mastek.springboot.bankapp.entity.BankAccount;

@Repository
public class BankAccountDAOImpl implements BankAccountDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public BankAccountDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<BankAccount> findAll() {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<BankAccount> theQuery =
				currentSession.createQuery("from BankAccount", BankAccount.class);
		
		// execute query and get result list
		List<BankAccount> bankaccounts = theQuery.getResultList();
		
		// return the results		
		return bankaccounts;
	}


	@Override
	public BankAccount findById(int theId) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// get the employee
		BankAccount theBankAccount =
				currentSession.get(BankAccount.class, theId);
		
		// return the employee
		return theBankAccount;
	}


	@Override
	public void save(BankAccount theBankAccount) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// save employee
		currentSession.saveOrUpdate(theBankAccount);
	}


	@Override
	public void deleteById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery(
						"delete from BankAccount where id=:bankaccountId");
		theQuery.setParameter("bankaccountId", theId);
		
		theQuery.executeUpdate();
	}

}







