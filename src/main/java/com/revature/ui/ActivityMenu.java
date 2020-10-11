package com.revature.ui;

import java.util.Scanner;

import com.revature.controller.ActivityController;
import com.revature.model.Activity;

public class ActivityMenu {
	
	private ActivityController bc;
	
	public ActivityMenu() {
	   this(new ActivityController());
	}
	
	public ActivityMenu(ActivityController bc) {
		super();
		this.bc = bc;
	}
    
	 public String askSelection(Scanner scan) {
		 System.out.println("Please make a selection");
		 System.out.println("1. get all accounts");
		 System.out.println("2. find activity by id");
		 System.out.println("0. return");
		 int selection = scan.nextInt();
		 switch(selection) {
		 case 1:
			 return bc.findAll().toString();
		 case 2:
			 System.out.println("Please enter activity ID");
			 int id = scan.nextInt();
			 Activity activity = bc.findById(id);
			 if (activity == null) {
				 return askSelection(scan);
			 } 
			 return activity.toString();
		 case 0:
			 return null;
		 default:
			 return askSelection(scan);
		 }
	 }
}
