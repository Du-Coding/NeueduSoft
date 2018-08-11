package com.dy.edu0726.work;

public class Test {

	public static void main(String[] args) {
		Work01 w_1 = new Work01();
		Thread t_1 = new Thread(w_1);
		t_1.setName("线程1");
		Work01 w_2 = new Work01();
		Thread t_2= new Thread(w_2);
		t_2.setName("线程2");
		t_1.start();
		t_2.start();
		
//		new Work02().start();
	}
	
}
