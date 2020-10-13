package com.revature.ui;

import java.util.Scanner;

import com.revature.controller.AccountController;
import com.revature.controller.ActivityController;
import com.revature.model.Account;
import com.revature.model.Activity;

public class ActivityMenu {
	
	private ActivityController bc;
	private AccountController acc;
	
	public ActivityMenu() {
	   this(new AccountController(), new ActivityController());
	   
	}
	
	
	public ActivityMenu(AccountController acc, ActivityController bc ) {
		this.acc = acc;
		this.bc = bc;
	}
	
	
    
	
	
	 public String employeeSelection(Scanner scan) {
		 System.out.println("Please make a selection");
		 System.out.println("1. View all Accounts");
		 System.out.println("2. View all Activites");
		 System.out.println("0. return");
		 int selection = scan.nextInt();
		 switch(selection) {
		 case 1:
			 return acc.findAll().toString();
		 default:
	    	 return employeeSelection(scan);
		 case 2:
			 return bc.findAll().toString();
		 case 0:
		 
	    	 return employeeSelection(scan);
		
		 }
	 }
	 
	 public String customerSelection(Scanner scan) {
		 System.out.println("Please make a selection");
		 System.out.println("1. Deposit or Withdrawal from Account");
		 System.out.println("2. View Customer Acctivity");
		 int selection = scan.nextInt();
		 switch(selection) {
		 case 1:
			 return createActivity(scan);
	     default:
	    	 return customerSelection(scan);
	     case 2:
			 System.out.println("Please enter Customer ID");
			 int id = scan.nextInt();
			 Activity activity = bc.findById(id);
			 if (activity == null) {
				 return customerSelection(scan);
			 } 
			 return activity.toString();
		 }
	 }  public String createActivity(Scanner scan) {
		 System.out.println("what is your Account Id?");
		 int accountId = scan.nextInt();
		 System.out.println("How much would you like to deposit/withdraw?");
		 int amount = scan.nextInt();
		 
		 if (amount > 0) {
			 Activity activity = new Activity(accountId, amount, "deposit");
		 }
		
	 }
	
}
