package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class OracleUtil {

	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String userName = "scott";
		String password = "123456";
		try {
			OracleUtil.conn = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接失败");
		}
		
	}
	
	private static Connection conn;

	public static Connection getConn() {
		return conn;
	}
	
	public static void setConn(Connection conn) {
		OracleUtil.conn = conn;
	}

	public static void colseQuery(Connection conn, Statement state, ResultSet rs) throws SQLException {
		
		if(rs != null) {
			rs.close();
		}
		if(state != null) {
			state.close();
		}
		if(conn != null) {
			conn.close();
		}
		
	}
	
	public static void close(Connection conn, Statement state) throws SQLException {
		
		if(state != null) {
			state.close();
		}
		if(conn != null) {
			conn.close();
	}
		
	}
}
