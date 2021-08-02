package com.mastek.springboot.bankapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mastek.springboot.bankapp.dao.BankAccountRepository;
import com.mastek.springboot.bankapp.entity.BankAccount;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	private BankAccountRepository bankaccountRepository;

	@Autowired
	public BankAccountServiceImpl(BankAccountRepository theBankAccountRepository) {
		 bankaccountRepository = theBankAccountRepository;
	}

	@Override

	public List<BankAccount> findAll() {
		return  bankaccountRepository.findAll();
	}

	@Override

	public BankAccount findById(int theId) {
		Optional<BankAccount> result =  bankaccountRepository.findById(theId);

		BankAccount theBankAccount = null;

		if (result.isPresent()) {
			theBankAccount = result.get();
		} else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}

		return theBankAccount;
	}

	@Override

	public void save(BankAccount theBankAccount) {
		 bankaccountRepository.save(theBankAccount);
	}

	@Override

	public void deleteById(int theId) {
		 bankaccountRepository.deleteById(theId);
	}

}
