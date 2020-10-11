package com.revature.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.clifton.cliftonbank.PlainTextConnectionUtil;
import com.revature.model.Activity;

public class ActivityDao implements DaoContract <Activity, Integer> {
  
	@Override
	public List<Activity> findAll() {
		List<Activity> activitys = new LinkedList<>();
		try(Connection conn = PlainTextConnectionUtil.getInstance().getConnection()){
			Statement s = conn.createStatement();
			String sql = "select * from Activity";
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				activitys.add(new Activity(rs.getInt(1), rs.getInt(2), rs.getString(3), null));
			}
			rs.close();
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return activitys;
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
