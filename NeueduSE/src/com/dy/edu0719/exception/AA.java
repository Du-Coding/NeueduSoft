package com.dy.edu0719.exception;

public class AA {

	public void method1() {
		System.out.println("ǰ111");
		method2();
		System.out.println("��111");
	}
	
	public void method2() {
		System.out.println("ǰ222");
		method3();
		System.out.println("��222");
	}
	
	public void method3() {
		System.out.println("ǰ333");
		int[] a = new int[5];
		System.out.println(a[5]);
		System.out.println("��333");
	}
	
}
