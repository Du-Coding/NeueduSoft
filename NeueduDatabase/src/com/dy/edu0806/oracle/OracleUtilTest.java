package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleUtilTest {

	public static void main(String[] args) throws SQLException {
		
		//查询20部门的员工信息，工资，入职信息，部门编号
		Connection conn = null;
		conn = OracleUtil.getConn();
		PreparedStatement state = conn.prepareStatement("select ename, sal, hiredate, deptno from emptest where deptno = ?");
		state.setInt(1, 20);
		ResultSet rs = state.executeQuery();
		while(rs.next()) {
			System.out.println(
					rs.getInt("deptno")+ " " + rs.getInt("sal")+ " "  
					+ rs.getString("ename")+ " "  + rs.getDate("hiredate")	
					);
		}
		
		OracleUtil.colseQuery(conn, state, rs);
	}
	
}
