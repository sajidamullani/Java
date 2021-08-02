package com.mastek.springboot.bankapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mastek.springboot.bankapp.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

}
