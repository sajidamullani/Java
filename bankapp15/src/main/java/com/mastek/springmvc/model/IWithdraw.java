package com.mastek.springmvc.model;

public interface IWithdraw {
	static final long serialVersionUID = 1L;
	String withdraw(double amount) throws Exception;
}
