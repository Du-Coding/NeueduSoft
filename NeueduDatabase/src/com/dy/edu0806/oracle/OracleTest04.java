package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleTest04 {
	
	//����򵥵�SQLע������
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String sal = sc.next();
		
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
//		Statement sm = conn.createStatement();
		//sqlע�룺���������ַ���ֱ�ӿ��Ա��SQL���ִ��
		//����취��ʹ��Ԥ�������preparedstatement
//		PreparedStatement ps = conn.prepareStatement("select * from users where uname = ? and upwd = ?");
		//����Ϊ���Լ����룩�Ĺ��ʸ�Ϊ6000
		PreparedStatement ps = conn.prepareStatement("update emptest set sal = ? where ename = ?");
		ps.setString(2, name);
		ps.setString(1, sal);
		//4��ִ��SQL���
//		ResultSet rs = sm.executeQuery("select * from users where uname = '"+ name +"' and upwd = '"+ upwd +"'");
		int a = ps.executeUpdate();
		//5��������
		/*if(rs.next()) {
			System.out.println("��¼�ɹ�����ӭ" + rs.getString("uname"));
		}else {
			System.out.println("�˺Ż��������");
		}*/
		System.out.println(a);
		//6���ͷ���Դ
		ps.close();
		conn.close();
	}
	
}
