package com.dy.edu0726.thread02;

public class Test01 {

	public static void main(String[] args) {
		
		//��ӰԺ��100��Ʊ����������ͬʱ��Ʊ
		Tickets tickets = new Tickets();
		Thread t_1 = new Thread(tickets);
		Thread t_2 = new Thread(tickets);
		Thread t_3 = new Thread(tickets);
		t_1.setName("��Ʊͤ1");
		t_2.setName("��Ʊͤ2");
		t_3.setName("��Ʊͤ3");
		
		t_1.start();
		t_2.start();
		t_3.start();
		
		//���ָ�Ʊ���
	}
	
}
