package com.clifton.cliftonbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PlainTextConnectionUtil {
	
	private final String url = "jdbc:postgresql://bankclifton.cr3mdvbkdi0b.us-east-2.rds.amazonaws.com"
			+ ":5432/postgres";
	private final String user = "jdbc_worker";
	private final String password = "wasspord";

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
	
	
	
}
