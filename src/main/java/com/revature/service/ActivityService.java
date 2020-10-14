package com.revature.service;

import java.util.List;

import com.revature.model.Account;
import com.revature.model.Activity;
import com.revature.repo.AccountDao;
import com.revature.repo.ActivityDao;

public class ActivityService {
  
	private ActivityDao bd;
	
	public ActivityService() {
		this(new ActivityDao());
	}

	public ActivityService(ActivityDao bd) {
		super();
		this.bd = bd;
	}
	
	public List<Activity> findAll() {
		return bd.findAll();
	}
	
	public Activity findById(Integer id) {
		return bd.findById(id);
	}
	
	public Activity create(Activity a) throws Exception {
		Activity result = bd.create(a);
		if(result == null) {
			throw new Exception("The activity was not created");
		}
		return result;
	}
	
}
