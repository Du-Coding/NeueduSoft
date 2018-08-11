package com.dy.edu0807.dbcp;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtil {

	private static String url;
	private static String userName;
	private static String password;
	private static String driverClass;
	private static Connection conn;
	private static DataSource dataSource;
	
	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		DBCPUtil.conn = conn;
	}

	static {
		
		try {
			Properties pro = readProperties();
			dataSource = BasicDataSourceFactory.createDataSource(pro);
		/*} catch (IOException e2) {
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
			DBCPUtil.conn = DriverManager.getConnection(url, userName, password);*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接失败");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Properties readProperties() throws Exception {
		
		InputStream in = DBCPUtil.class.getClassLoader().getResourceAsStream("dbcp.properties");
		Properties pro = new Properties();
		pro.load(in);
		
		/*url = pro.getProperty("url");
		userName = pro.getProperty("userName");
		password = pro.getProperty("password");
		driverClass = pro.getProperty("driverClass");
		*/
		return pro;
	}
	
}
