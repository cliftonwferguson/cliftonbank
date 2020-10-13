package com.revature.controller;


import java.util.List;

import com.revature.model.Account;
import com.revature.model.Activity;
import com.revature.service.AccountService;

public class AccountController {
    
	private AccountService ac;
    
	public AccountController() {
		this(new AccountService());
	}
    
	public AccountController(AccountService ac) {
		super();
		this.ac = ac;
	}
	
	public String insert(Account a) {
		try {
			Account result = ac.create(a);
			return result.toString();
			}catch (Exception e) {
				return e.getMessage();
			}
	}

	public List<Account> findAll() {
		return ac.findAll();
	} 
}
