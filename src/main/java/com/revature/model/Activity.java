package com.revature.model;

public class Activity {
	// create private fields from SQL table
	// generate getters and setters
	// generate toString()
	// generate constructors
	// generate call to super() constructor

	private int account_id;
	// private create_Date
	private double amount;
	private String activity_type;
	private Account belongsTo;

	public Activity(int account_id, double amount, String activity_type, Account belongsTo) {
		super();
		this.account_id = account_id;
		this.amount = amount;
		this.activity_type = activity_type;
		this.belongsTo = belongsTo;
	}
	
	
	
	

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Activity(int accountId, double amount2, String activityType) {
		this.account_id = accountId;
		this.amount = amount2;
		this.activity_type = activityType;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getActivity_type() {
		return activity_type;
	}

	public void setActivity_type(String activity_type) {
		this.activity_type = activity_type;
	}

	public Account getBelongsTo() {
		return belongsTo;
	}

	public void setBelongsTo(Account belongsTo) {
		this.belongsTo = belongsTo;
	}

	@Override
	public String toString() {
		return "Activity [account_id=" + account_id + ", amount=" + amount + ", activity_type=" + activity_type
				+ ", belongsTo=" + belongsTo + "]";
	}

}
