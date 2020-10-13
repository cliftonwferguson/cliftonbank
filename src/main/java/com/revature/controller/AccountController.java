package com.revature.controller;


import com.revature.model.Account;
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
}
