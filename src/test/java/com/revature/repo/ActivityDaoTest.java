package com.revature.repo;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.revature.model.Activity;

public class ActivityDaoTest {

	private ActivityDao bd;
	
	@Before
	public void setup() {
		bd=new ActivityDao();
	}
	
	@Test
	public void findAllTest() {
	  List<Activity> activities = bd.findAll();
	  assertFalse(activities.size() == 0);
	}

	
	
}
