package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OracleTest02 {
	//ʵ��jdbc�������ݿ�
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
			
		//����
		//1��ע������
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2��������Ӷ���
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String userName = "scott";
		String password = "123456";
		Connection conn = DriverManager.getConnection(url, userName, password);
				
		System.out.println(conn + "���ݿ����ӳɹ�");
				
		//3�����SQL���ִ��ƽ̨
		Statement sm = conn.createStatement();
		//4��ִ��SQL���
		ResultSet rs = sm.executeQuery("select empno, ename, sal, deptno, hiredate from emp");
		//5��������
		System.out.println(rs.next());
		while(rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			double sal = rs.getDouble("sal");
			int deptno = rs.getInt("deptno");
			Date hiredate = rs.getDate("hiredate");
			System.out.println("��ѯ����ϢΪ��"+ empno + " "+ ename + " "+ sal + " "+ deptno+ " "+ hiredate);
		}
		//6���ͷ���Դ
		sm.close();
		conn.close();
	}
}
