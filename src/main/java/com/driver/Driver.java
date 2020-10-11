package com.driver;

import java.util.Scanner;

import com.revature.ui.ActivityMenu;


      
		public class Driver {
		    
			 private static ActivityMenu bm = new ActivityMenu();
			 
			 public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				mainMenu(scanner);
				
			}
			 
			private static void mainMenu(Scanner scan) {
				System.out.println("Account Activity Overview");
				System.out.println("Would you like to check your account?");
				System.out.println("1. activity");
				System.out.println("0. exit");
				int selection = scan.nextInt();
				switch(selection) {
				case 1:
					System.out.println(bm.askSelection(scan));
					mainMenu(scan);
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("please chose a valid option");
					mainMenu(scan);
				}
			}
		}
