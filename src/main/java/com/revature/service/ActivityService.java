package com.revature.service;

import java.util.List;

import com.revature.model.Activity;
import com.revature.repo.AccountDao;
import com.revature.repo.ActivityDao;

public class ActivityService {
  
	private ActivityDao bd;
	
	public ActivityService() {
		this(new ActivityDao(new AccountDao()));
	}

	public ActivityService(ActivityDao bd) {
		super();
		this.bd = bd;
	}
	
	public List<Activity> findAll() {
		return bd.findAll();
	}
}
