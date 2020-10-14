package com.driver;

import java.util.Scanner;

import com.revature.ui.AccountMenu;
import com.revature.ui.ActivityMenu;

public class Driver {

	private static ActivityMenu activityMenu = new ActivityMenu();
	private static AccountMenu accountMenu = new AccountMenu();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		mainMenu(scanner);

	}

	private static void mainMenu(Scanner scan) {
		int count = 100;
		while (count > 0) {
			count--;
			System.out.println(" ");
			System.out.println("Clifton Bank Overview");
			System.out.println("Please select from the following options.");
			System.out.println("1. Employee Access");
			System.out.println("2. New Customer");
			System.out.println("3. Customer Activity");
			int selection = scan.nextInt();
			switch (selection) {
			case 1:
				System.out.println(activityMenu.employeeSelection(scan));
				mainMenu(scan);
				break;
			case 2:
				accountMenu.createAccount(scan);
				break;
			case 3:
				System.out.println(activityMenu.customerSelection(scan));
				
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Please chose a valid option");
				mainMenu(scan);
			}
		}
	}
}
