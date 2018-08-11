package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleTest04 {
	
	//解决简单的SQL注入问题
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String sal = sc.next();
		
		//步骤
		//1、注册驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2、获得连接对象
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String userName = "scott";
		String password = "123456";
		Connection conn = DriverManager.getConnection(url, userName, password);
				
		System.out.println(conn + "数据库连接成功");
				
		//3、获得SQL语句执行平台
//		Statement sm = conn.createStatement();
		//sql注入：传进来的字符，直接可以变成SQL语句执行
		//解决办法：使用预编译对象preparedstatement
//		PreparedStatement ps = conn.prepareStatement("select * from users where uname = ? and upwd = ?");
		//名字为（自己输入）的工资改为6000
		PreparedStatement ps = conn.prepareStatement("update emptest set sal = ? where ename = ?");
		ps.setString(2, name);
		ps.setString(1, sal);
		//4、执行SQL语句
//		ResultSet rs = sm.executeQuery("select * from users where uname = '"+ name +"' and upwd = '"+ upwd +"'");
		int a = ps.executeUpdate();
		//5、处理结果
		/*if(rs.next()) {
			System.out.println("登录成功：欢迎" + rs.getString("uname"));
		}else {
			System.out.println("账号或密码错误");
		}*/
		System.out.println(a);
		//6、释放资源
		ps.close();
		conn.close();
	}
	
}
