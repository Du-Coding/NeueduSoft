package com.dy.edu0726.thread04;

public class Test01 {

	public static void main(String[] args) {
		
		DeadLockTest dlt = new DeadLockTest();
		
		Thread t1 = new Thread(dlt);
		Thread t2 = new Thread(dlt);
		
		t1.start();
		t2.start();
		
	}
	
}
