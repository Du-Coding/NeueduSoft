package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleTest {
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
		int a = sm.executeUpdate("insert into emptest(empno, ename, sal, deptno) values(9001, '����', 3000, 40)");
		//5��������
		System.out.println(a);
		//6���ͷ���Դ
		sm.close();
		conn.close();
			
	}
	
}
