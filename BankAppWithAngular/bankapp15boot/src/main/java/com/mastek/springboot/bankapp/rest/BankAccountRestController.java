package com.mastek.springboot.bankapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.springboot.bankapp.entity.BankAccount;
import com.mastek.springboot.bankapp.service.BankAccountService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping("/api")
public class BankAccountRestController {

	private BankAccountService bankaccountService;
	
	@Autowired
	public BankAccountRestController(BankAccountService theBankAccountService) {
		bankaccountService = theBankAccountService;
	}
	
	// expose "/employees" and return list of employees
	@GetMapping("/bankaccounts")
	public List<BankAccount> findAll() {
		return bankaccountService.findAll();
	}

	// add mapping for GET /employees/{employeeId}
	
	@GetMapping("/bankaccounts/{bankaccountId}")
	public BankAccount getBankAccount(@PathVariable int bankaccountId) {
		
		BankAccount theBankAccount = bankaccountService.findById(bankaccountId);
		
		if (theBankAccount == null) {
			throw new RuntimeException("BankAccount id not found - " + bankaccountId);
		}
		
		return theBankAccount;
	}
	
	// add mapping for POST /employees - add new employee
	
	@PostMapping("/bankaccounts")
	public BankAccount addBankAccount(@RequestBody BankAccount theBankAccount) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theBankAccount.setId(0);
		
		bankaccountService.save(theBankAccount);
		
		return theBankAccount;
	}
	
	// add mapping for PUT /employees - update existing employee
	
	@PutMapping("/bankaccounts")
	public BankAccount updateBankAccount(@RequestBody BankAccount theBankAccount) {
		
		bankaccountService.save(theBankAccount);
		
		return theBankAccount;
	}
	
	// add mapping for DELETE /employees/{employeeId} - delete employee
	
	@DeleteMapping("/bankaccounts/{bankaccountId}")
	public int deleteBankAccount(@PathVariable int bankaccountId) {
		
		BankAccount tempBankAccount = bankaccountService.findById(bankaccountId);
		
		// throw exception if null
		
		if (tempBankAccount == null) {
			throw new RuntimeException("BankAccount id not found - " + bankaccountId);
		}
		
		bankaccountService.deleteById(bankaccountId);
		
		return bankaccountId;
	}
	
}










