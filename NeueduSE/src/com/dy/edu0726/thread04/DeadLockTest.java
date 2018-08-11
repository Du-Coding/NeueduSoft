package com.dy.edu0726.thread04;

public class DeadLockTest implements Runnable{

	Object o_1 = LockTest.locka;
	Object o_2 = LockTest.lockb;
	
	//两个线程输出1~100
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			synchronized (o_1) {
				System.out.println("A掐着B");
				synchronized (o_2) {
					System.out.println("A你快松手");
				}
			}
			synchronized (o_2) {
				System.out.println("B掐着A");
				synchronized (o_1) {
					System.out.println("B你快松手");
				}
			}
		}
		
	}

	
}
