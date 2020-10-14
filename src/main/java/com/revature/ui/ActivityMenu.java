package com.revature.ui;

import java.util.List;
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

	public ActivityMenu(AccountController acc, ActivityController bc) {
		this.acc = acc;
		this.bc = bc;
	}

	public String employeeSelection(Scanner scan) {
		System.out.println("Please make a selection");
		System.out.println("1. View all Accounts");
		System.out.println("2. View all Activites");
		System.out.println("0. return");
		int selection = scan.nextInt();
		switch (selection) {
		case 1:
			return printAccounts(acc.findAll());
		default:
			return employeeSelection(scan);
		case 2:
			return printActivities(bc.findAll());
			//return bc.findAll().toString();
		case 0:

			return employeeSelection(scan);

		}
	}

	public String customerSelection(Scanner scan) {
		System.out.println("Please make a selection");
		System.out.println("1. Deposit or Withdrawal from Account");
		System.out.println("2. View Customer Acctivity");
		int selection = scan.nextInt();
		switch (selection) {
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
	}

	public String createActivity(Scanner scan) {
		System.out.println("what is your Account Id?");
		int accountId = scan.nextInt();
		System.out.println("How much would you like to deposit/withdraw?");
		double amount = scan.nextDouble();
        System.out.println("Withdraw or Deposit?");
		String activityType = scan.next();
		Activity activity = new Activity(accountId, amount, activityType);
		String result = bc.insert(activity);
		return result;
	}

	private String printAccounts(List<Account> accounts) {
		StringBuilder builder = new StringBuilder();
		for (Account account : accounts) {
			builder.append(account);
			builder.append("\n");
		}
		return builder.toString();
	}
	
	private String printActivities(List<Activity> activities) {
		StringBuilder builder = new StringBuilder();
		for (Activity activities1 : activities) {
			builder.append(activities1);
			builder.append("\n");
		} return builder.toString();
	} 

}
