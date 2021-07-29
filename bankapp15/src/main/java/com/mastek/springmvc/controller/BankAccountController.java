package com.mastek.springmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mastek.springmvc.model.BankAccount;
import com.mastek.springmvc.model.SalaryAccount;
import com.mastek.springmvc.model.SavingAccount;
import com.mastek.springmvc.service.BankAccountService;

@Controller
public class BankAccountController {

	private static final Logger logger = Logger.getLogger(BankAccountController.class);

	public BankAccountController() {
		System.out.println("BankAccountController()");
	}

	@Autowired
	@Qualifier("bankAccountServiceImpl")
	private BankAccountService bankAccountService;

	@RequestMapping(value = "/")
	public ModelAndView listBankAccount(ModelAndView model) throws IOException {
		List<BankAccount> listBankAccount = bankAccountService.getAllBankAccounts();
		model.addObject("listBankAccount", listBankAccount);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/salaryAccount", method = RequestMethod.GET)
	public ModelAndView salaryAccount(ModelAndView model) {
		SalaryAccount salaryAccount = new SalaryAccount();
		model.addObject("salaryAccount", salaryAccount);
		model.setViewName("SalaryAccountForm");
		return model;
	}
	
	@RequestMapping(value = "/savingAccount", method = RequestMethod.GET)
	public ModelAndView savingAccount(ModelAndView model) {
		SavingAccount savingAccount = new SavingAccount();
		model.addObject("savingAccount", savingAccount);
		model.setViewName("SavingAccountForm");
		return model;
	}

	@RequestMapping(value = "/saveSavingAccount", method = RequestMethod.POST)
	public ModelAndView saveBankAccount(@ModelAttribute SavingAccount bankAccount) {
		if ( bankAccount.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			bankAccountService.addBankAccount(bankAccount);
		} else {
			bankAccountService.updateBankAccount(bankAccount);
		}
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/saveSalaryAccount", method = RequestMethod.POST)
	public ModelAndView saveBankAccount2(@ModelAttribute SalaryAccount bankAccount) {
		if ( bankAccount.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			bankAccountService.addBankAccount(bankAccount);
		} else {
			bankAccountService.updateBankAccount(bankAccount);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteBankAccount", method = RequestMethod.GET)
	public ModelAndView deleteBankAccount(HttpServletRequest request) {
		int bankAccountId = Integer.parseInt(request.getParameter("id"));
		bankAccountService.deleteBankAccount(bankAccountId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editBankAccount", method = RequestMethod.GET)
	public ModelAndView editSavingAccount(HttpServletRequest request) {
		int bankAccountId= Integer.parseInt(request.getParameter("id"));
		String type=String.valueOf(request.getParameter("type"));
		BankAccount account = bankAccountService.getBankAccount(bankAccountId);
		ModelAndView model;
		if(type.equalsIgnoreCase("saving")) {
		model = new ModelAndView("SavingAccountForm");
		}else {
			model = new ModelAndView("SalaryAccountForm");
		}
		model.addObject("account", account);

		return model;
	}
	

}