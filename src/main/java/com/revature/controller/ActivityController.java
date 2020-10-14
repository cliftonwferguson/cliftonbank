package com.revature.controller;

import java.util.List;

import com.revature.model.Account;
import com.revature.model.Activity;
import com.revature.service.ActivityService;

public class ActivityController {

	private ActivityService bs;

	public ActivityController() {
		this(new ActivityService());
	}

	public ActivityController(ActivityService bs) {
		super();
		this.bs = bs;
	}

	public String insert(Activity a) {
		try {
			Activity result = bs.create(a);
			return result.toString();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public List<Activity> findAll() {
		return bs.findAll();
	}

	public Activity findById(Integer id) {
		return bs.findById(id);
	}
}
