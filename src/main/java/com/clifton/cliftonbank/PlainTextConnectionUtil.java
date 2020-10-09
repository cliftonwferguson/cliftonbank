package com.clifton.cliftonbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PlainTextConnectionUtil {
	private static final String url = "jdbc:postgresql://bankclifton.cr3mdvbkdi0b.us-east-2.rds.amazonaws.com"
			+ ":5432/postgres";
	private static final String user = "jdbc_worker";
	private static final String password = "wasspord";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from person;")) {

			// while loop

			while (rs.next()) {

				// mapping data from resultSet into local variables

				
				String fileExt = rs.getString("email");
				

				// printing result to console
				System.out.printf(
						"file_hash: %s, file_size: %d, file_extension: %s"
								+ "mime_type: %s, file_tags: %s, file_name: %s%n",
						hash, fileSize, fileExt, mimeType, fileTags, fileName);

			}

		} catch (SQLException t) {
			throw new RuntimeException(t);
		}

	}
}
