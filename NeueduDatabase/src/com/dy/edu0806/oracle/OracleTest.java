package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleTest {
	//实现jdbc连接数据库
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
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
		int a = sm.executeUpdate("insert into emptest(empno, ename, sal, deptno) values(9001, '张三', 3000, 40)");
		//5、处理结果
		System.out.println(a);
		//6、释放资源
		sm.close();
		conn.close();
			
	}
	
}
