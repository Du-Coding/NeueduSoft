package com.dy.edu0806.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleUtilTest02 {
	
public static void main(String[] args) throws SQLException {
		
		//��ѯ20���ŵ�Ա����Ϣ�����ʣ���ְ��Ϣ�����ű��
		Connection conn = null;
		conn = OracleUtil.getConn();
		//����
		Statement state = conn.createStatement();
		state.executeUpdate("updqte emptest set sal = sal - 100 where ename = 'KING'");
//		System.out.println(10/0);
		state.executeUpdate("updqte emptest set sal = sal - 100 where ename = 'SCOTT'");
		conn.commit();//ͬʱ�ύ����ͬʱʧ��
//		PreparedStatement state = conn.prepareStatement("updqte emptest set sal = sal - 100 where ename = ?");
//		PreparedStatement state1 = conn.prepareStatement("update emptest set sal = sal + 100 where ename = ?");
		OracleUtil.close(conn, state);
	}
	
}
