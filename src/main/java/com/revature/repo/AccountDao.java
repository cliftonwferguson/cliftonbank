package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.clifton.cliftonbank.PlainTextConnectionUtil;
import com.revature.model.Account;
import com.revature.model.Activity;

public class AccountDao implements DaoContract <Account, String> {

private static final Logger accountLog = Logger.getLogger(AccountDao.class);	
	
	@Override
	public List<Account> findAll() {
		List<Account> account = new LinkedList<>();
		String sql = "select * from public.account";
		try (Connection conn = PlainTextConnectionUtil.getInstance().getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				account.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getFloat(5)));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
		
	}

	@Override
	public Account findById(String i) {
		
		return null;
	}

	@Override
	public Account update(Account t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account create(Account t) {
		try(Connection conn = PlainTextConnectionUtil.getInstance().getConnection()){
			String sql = "insert into account (current_balance, username, password, is_customer) values (?,?,?,false) ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setFloat (1, t.getCurrent_balance());
			ps.setString(2, t.getUsername());
			ps.setString(3, t.getPassword());
			ps.executeUpdate();
			accountLog.info("UserCreated" + t.getUsername()); 
				
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return t;
	}

	
	@Override
	public int delete(String i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
