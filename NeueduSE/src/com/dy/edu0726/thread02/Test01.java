package com.dy.edu0726.thread02;

public class Test01 {

	public static void main(String[] args) {
		
		//电影院，100张票，三个窗口同时买票
		Tickets tickets = new Tickets();
		Thread t_1 = new Thread(tickets);
		Thread t_2 = new Thread(tickets);
		Thread t_3 = new Thread(tickets);
		t_1.setName("售票亭1");
		t_2.setName("售票亭2");
		t_3.setName("售票亭3");
		
		t_1.start();
		t_2.start();
		t_3.start();
		
		//出现负票情况
	}
	
}
