package com.revature.ui;

import java.util.Scanner;

import com.revature.controller.AccountController;
import com.revature.controller.ActivityController;
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
		 System.out.println("2. View activities by ID");
		 System.out.println("0. return");
		 int selection = scan.nextInt();
		 switch(selection) {
		 case 1:
			 return acc.findAll().toString();
		 default:
	    	 return employeeSelection(scan);
		 case 2:
			 System.out.println("Please enter activity ID");
			 int id = scan.nextInt();
			 Activity activity = bc.findById(id);
			 if (activity == null) {
				 return employeeSelection(scan);
			 } 
			 return activity.toString();
		 case 0:
			 return null;
		
		 }
	 }
	 
	 public String customerSelection(Scanner scan) {
		 System.out.println("Please make a selection");
		 System.out.println("1. Get all Accounts");
		 System.out.println("2. View All Activity");
		 int selection = scan.nextInt();
		 switch(selection) {
		 case 1:
			 return acc.findAll().toString();
	     default:
	    	 return customerSelection(scan);
	     case 2:
			 System.out.println("Please enter activity ID");
			 int id = scan.nextInt();
			 Activity activity = bc.findById(id);
			 if (activity == null) {
				 return customerSelection(scan);
			 } 
			 return activity.toString();
		 }
	 }
	
}
