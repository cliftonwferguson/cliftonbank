package com.revature.ui;

import java.util.Scanner;

import com.revature.controller.ActivityController;

public class ActivityMenu {
	
	private ActivityController bc;
	
	public ActivityMenu() {
	   this(new ActivityController());
	}
	
	public ActivityMenu(ActivityController bc) {
		super();
		this.bc = bc;
	}
    
	 public String ActivityMenu(Scanner scan) {
		 System.out.println("Please make a selection");
		 System.out.println("1. get all accounts");
		 System.out.println("0. return");
		 int selection = scan.nextInt();
		 switch(selection) {
		 case 1:
			 return bc.findAll().toString();
		 case 0:
			 return null;
		 default:
			 return ActivityMenu(scan);
		 }
	 }
}
