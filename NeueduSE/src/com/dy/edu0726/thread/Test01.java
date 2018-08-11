package com.dy.edu0726.thread;

public class Test01 {

	public static void main(String[] args) {//名字为main的线程栈是jvm自动王城
		
		//栈内顺序执行
		new Test01().method2();
		new ThreadTest().start();//start：1、开辟新的栈，将类中的方法入栈，执行方法--->开辟新的线程
		RunableTest rt =  new RunableTest();
		Thread t = new Thread(rt);
		t.start();
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		
		//多线程的实现方式
		//1、继承Thread类，调用start()方法
		//首先开辟一条新的栈，类中的方法入新开辟的栈
		
	}
	
	public void method2() {
		System.out.println("Method2");
	}
	
}
