package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OracleTest03 {
	//ʵ��jdbc�������ݿ�
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String name = "TOM";
		String upwd = "123";
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
		ResultSet rs = sm.executeQuery("select * from users where uname = '"+ name +"' and upwd = '"+ upwd +"'");
		//5��������
		if(rs.next()) {
			System.out.println("��¼�ɹ�����ӭ" + rs.getString("uname"));
		}else {
			System.out.println("�˺Ż��������");
		}
		//6���ͷ���Դ
		sm.close();
		conn.close();
	}
}
