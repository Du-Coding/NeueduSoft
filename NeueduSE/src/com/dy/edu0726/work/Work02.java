package com.dy.edu0726.work;

public class Work02 extends Thread {

	public void run() {
		for(int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
}
