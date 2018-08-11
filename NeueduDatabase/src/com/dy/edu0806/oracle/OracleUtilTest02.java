package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleUtilTest02 {
	
public static void main(String[] args) throws SQLException {
		
		//查询20部门的员工信息，工资，入职信息，部门编号
		Connection conn = null;
		conn = OracleUtil.getConn();
		//事务
		Statement state = conn.createStatement();
		state.executeUpdate("updqte emptest set sal = sal - 100 where ename = 'KING'");
//		System.out.println(10/0);
		state.executeUpdate("updqte emptest set sal = sal - 100 where ename = 'SCOTT'");
		conn.commit();//同时提交或是同时失败
//		PreparedStatement state = conn.prepareStatement("updqte emptest set sal = sal - 100 where ename = ?");
//		PreparedStatement state1 = conn.prepareStatement("update emptest set sal = sal + 100 where ename = ?");
		OracleUtil.close(conn, state);
	}
	
}
