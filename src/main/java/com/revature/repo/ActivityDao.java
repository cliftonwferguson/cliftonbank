package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.clifton.cliftonbank.PlainTextConnectionUtil;
import com.revature.model.Activity;

public class ActivityDao implements DaoContract <Activity, Integer> {
    private AccountDao cd;
	
	public ActivityDao(AccountDao cd) {
		super();
		this.cd = cd;
	}
	

	@Override
	public List<Activity> findAll() {
		List<Activity> activities = new LinkedList<>();
		String sql = "select * from public.\"Activity\"";
		try(Connection conn = PlainTextConnectionUtil.getInstance().getConnection(); 
				PreparedStatement ps = conn.prepareStatement(sql)){	
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				activities.add(new Activity(rs.getInt(1), rs.getInt(2), rs.getString(3), null));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return activities;
	}

	@Override
	public Activity findById(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity update(Activity t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity create(Activity t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
