package com.revature.controller;

import java.util.List;

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
	
	public List<Activity> findAll() {
		return bs.findAll();
	} 
}
