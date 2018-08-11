package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OracleTest03 {
	//实现jdbc连接数据库
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String name = "TOM";
		String upwd = "123";
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
		Statement sm = conn.createStatement();
		//4、执行SQL语句
		ResultSet rs = sm.executeQuery("select * from users where uname = '"+ name +"' and upwd = '"+ upwd +"'");
		//5、处理结果
		if(rs.next()) {
			System.out.println("登录成功：欢迎" + rs.getString("uname"));
		}else {
			System.out.println("账号或密码错误");
		}
		//6、释放资源
		sm.close();
		conn.close();
	}
}
