package com.dy.edu0726.thread;

public class Test01 {

	public static void main(String[] args) {//����Ϊmain���߳�ջ��jvm�Զ�����
		
		//ջ��˳��ִ��
		new Test01().method2();
		new ThreadTest().start();//start��1�������µ�ջ�������еķ�����ջ��ִ�з���--->�����µ��߳�
		RunableTest rt =  new RunableTest();
		Thread t = new Thread(rt);
		t.start();
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		
		//���̵߳�ʵ�ַ�ʽ
		//1���̳�Thread�࣬����start()����
		//���ȿ���һ���µ�ջ�����еķ������¿��ٵ�ջ
		
	}
	
	public void method2() {
		System.out.println("Method2");
	}
	
}
