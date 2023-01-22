package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

		
	public static Connection provideConnection() {
			
			Connection conn = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/sb101";
			
			try {
				conn = DriverManager.getConnection(url, "root", "rohit");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return conn;
		}

	}

