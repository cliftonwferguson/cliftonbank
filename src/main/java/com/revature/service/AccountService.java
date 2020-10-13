package com.revature.service;

import java.util.List;

import com.revature.model.Account;

import com.revature.repo.AccountDao;

public class AccountService {
	
	private AccountDao ad;
	
	public AccountService() {
		this(new AccountDao());
	}
	
	public AccountService(AccountDao ad) {
		super();
		this.ad = ad;
	}
	
	public Account create(Account a) throws Exception {
		Account result = ad.create(a);
		if(result == null) {
			throw new Exception("The account was not created");
		}
		return result;
	}
	
	public List<Account> findAll() {
		return ad.findAll();
	}
	
	
	
}
