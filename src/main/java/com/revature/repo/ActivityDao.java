package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.clifton.cliftonbank.PlainTextConnectionUtil;
import com.revature.model.Account;
import com.revature.model.Activity;

public class ActivityDao implements DaoContract<Activity, Integer> {

	public ActivityDao() {
		super();

	}

	@Override
	public List<Activity> findAll() {
		List<Activity> activities = new LinkedList<>();
		String sql = "select account_id, amount, activity_type  from public.activity";
		try (Connection conn = PlainTextConnectionUtil.getInstance().getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				activities.add(new Activity(rs.getInt(1), rs.getDouble(2), rs.getString(3), null));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return activities;
	}

	@Override
	public Activity findById(Integer account_id) {
//		 id serial primary key,
//			account_id integer NOT NULL,
//			amount double precision NOT NULL,
//			activity_type varchar NOT null,
		String sql = "select account_id, amount, activity_type  from public.activity where id = ?";
		Activity activity = null;
		try (Connection conn = PlainTextConnectionUtil.getInstance().getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, account_id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				activity = new Activity(rs.getInt(1), rs.getDouble(2), rs.getString(3), null);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return activity;
	}

	@Override
	public Activity update(Activity t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Activity create(Activity t) {

		try (Connection conn = PlainTextConnectionUtil.getInstance().getConnection()) {
			String sql = "insert into activity (account_id,amount,activity_type) values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getAccount_id());
			ps.setDouble(2, t.getAmount());
			ps.setString(3, t.getActivity_type());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return t;
	}

	@Override
	public int delete(Integer i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
