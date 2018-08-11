package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDBUtilTest {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = OracleDBTest.getConn();
		
		PreparedStatement ps = conn.prepareStatement("select * from emp");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("empno"));
		}
		rs.close();
		ps.close();
		conn.close();
		
	}
	
}
