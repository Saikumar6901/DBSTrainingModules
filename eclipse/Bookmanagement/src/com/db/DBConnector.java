package com.db;
//import java.util.*;
import java.sql.*;

public class DBConnector {
Connection conn=null;
String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
String DB_URL2 = "jdbc:mariadb://localhost:3306/sai";
String USER = "root";
String PASS = "password";
	public DBConnector() {
		// TODO Auto-generated constructor stub
	}
	public Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
	        conn = DriverManager.getConnection(DB_URL2, USER, PASS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
//	public Statement getStatement() {
//		conn=getConnection();
//		try {
//			stmt = conn.createStatement();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return stmt;
//	}
}
