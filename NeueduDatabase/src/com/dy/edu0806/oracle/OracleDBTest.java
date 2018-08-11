package com.dy.edu0806.oracle;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleDBTest {

	private static String url;
	private static String userName;
	private static String password;
	private static String driverClass;
	private static Connection conn;
	
	
	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		OracleDBTest.conn = conn;
	}

	static {
		
		try {
			readProperties();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			OracleDBTest.conn = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接失败");
		}
		
	}
	
	public static void readProperties() throws IOException {
		
		InputStream in = OracleDBTest.class.getClassLoader().getResourceAsStream("Oracledb.properties");
		Properties pro = new Properties();
		pro.load(in);
		url = pro.getProperty("url");
		userName = pro.getProperty("userName");
		password = pro.getProperty("password");
		driverClass = pro.getProperty("driverClass");
		
	}
	
}
