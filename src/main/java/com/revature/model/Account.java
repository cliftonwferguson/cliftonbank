package com.revature.model;

import java.util.Set;

public class Account {
	//create private fields from SQL table
    //generate getters and setters
	//generate toString()
	//generate constructors
	
	private int account_id;
	private String username;
	private String password;
	private float current_balance;
	private boolean is_customer;
	private Set<Activity> activity;
	
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getCurrent_balance() {
		return current_balance;
	}
	public void setCurrent_balance(float current_balance) {
		this.current_balance = current_balance;
	}
	public boolean isIs_customer() {
		return is_customer;
	}
	public void setIs_customer(boolean is_customer) {
		this.is_customer = is_customer;
	}
	public Set<Activity> getActivity() {
		return activity;
	}
	public void setActivity(Set<Activity> activity) {
		this.activity = activity;
	}
	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", username=" + username + ", password=" + password
				+ ", current_balance=" + current_balance + ", is_customer=" + is_customer + ", activity=" + activity
				+ "]\n";
		
	}
	//String sql = "select username, password, is_customer, current_balance from public.account";
	public Account(String username, String password, boolean is_customer, float current_balance) {
		super();
		
		this.username = username;
		this.password = password;
		this.current_balance = current_balance;
		this.is_customer = is_customer;
		activity = null;
		
	}
	
	//String sql = "select account_id, username, password, is_customer, current_balance from public.account";
	public Account(float currentBalance, String userName, String passWord) {
		 this.current_balance = currentBalance;
		 this.username = userName;
		 this.password = passWord;
		 this.is_customer = false;
	}
	
	
	
	
}
