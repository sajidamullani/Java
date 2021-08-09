package com.mastek.springmvc.model;

public interface IDeposit {
	static final long serialVersionUID = 1L;
	String deposit(double amount) throws Exception;
}
