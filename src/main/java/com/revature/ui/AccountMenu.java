package com.revature.ui;

import java.util.Scanner;

import com.revature.controller.AccountController;
import com.revature.model.Account;
import com.revature.repo.AccountDao;



public class AccountMenu {
    
    private static AccountDao acd;
	
	private AccountController ac;
	
	public AccountMenu() {
		this.ac = (new AccountController());
		this.acd = (new AccountDao());
	}
	
	
	
	public AccountMenu(AccountController ac) {
		super();
		this.ac = ac;
	}
	
//	public String displayMenu(Scanner scan) {
//		System.out.println("What would you like to do?");
//		System.out.println("1. Create Account");
//		int result = scan.nextInt();
//		switch(result) {
//		case 1:
//			createAccount(scan);
//		case 0: 
//			 return null;
//		default:
//			System.out.println("please choose a valid option");
//			return displayMenu(scan);
//		}
//		
//	}
	
	public void createAccount(Scanner scan) {
		System.out.println("How much would you like to deposit?");
		float currentBalance = scan.nextFloat();
		System.out.println("What is your name?");
		String userName = scan.next();
		System.out.println("what is your new password?");
		String passWord = scan.next();
		Account account = new Account(currentBalance, userName,passWord);
		acd.create(account);
	}

	
}
