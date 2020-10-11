package com.clifton.cliftonbank;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class PlainTextConnectionUtil {
	
	private final String url = "jdbc:postgresql://bankclifton.cr3mdvbkdi0b.us-east-2.rds.amazonaws.com"
			+ ":5432/postgres";
	private final String username = "jdbc_worker";
	private final String password = "wasspord";

	//to make a singleton
	private static PlainTextConnectionUtil instance;

	private PlainTextConnectionUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static PlainTextConnectionUtil getInstance() {
		if(instance == null) {
			instance = new PlainTextConnectionUtil();
		}
		return instance;
	}
	//to create a connection to the db
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
	
	
}
