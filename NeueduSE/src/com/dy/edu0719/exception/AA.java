package com.dy.edu0719.exception;

public class AA {

	public void method1() {
		System.out.println("前111");
		method2();
		System.out.println("后111");
	}
	
	public void method2() {
		System.out.println("前222");
		method3();
		System.out.println("后222");
	}
	
	public void method3() {
		System.out.println("前333");
		int[] a = new int[5];
		System.out.println(a[5]);
		System.out.println("后333");
	}
	
}
