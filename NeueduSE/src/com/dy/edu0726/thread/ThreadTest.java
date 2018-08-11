package com.dy.edu0726.thread;

public class ThreadTest extends Thread {
	
	public void run() {//Thread类中的空参run方法
		for(int i = 0; i < 100; i++) {
			System.out.println("ThreadTest" + i);
		}
	}
	
	public void method1() {
		System.out.println("ThreadTest Method1");
	}
	
}
