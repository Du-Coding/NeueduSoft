package com.dy.edu0719.exception;

import java.io.IOException;

public class Exception01 {

	public static void main(String[] args) {
		//异常：运行时出现的问题
		//错误：编译错误
		
		//以下是没有对异常进行处理
		//int a = 10/0;
		/*数组下标越界异常 
		int[] a = new int[4];
		System.out.println(a[4]);*/
		
		//对异常进行处理
		//写多个catch的顺序：父类在子类之下
		try {
			int[] a = new int[5];
			System.out.println(a[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("haole");
		}finally {
			System.out.println("不管太try是否有异常，catch到异常，都会执行finally");
		}
		
//		method1();
	}
	static void method1() {
		method1();
	}
	
	void method2() throws IOException {//出现检查性异常，必须解决，解决方式：1、try catch 2、声明throws 异常类型
		System.out.println("玩");       //throws：声明异常，有可能出现问题的异常类型，此方法中有异常所以需要向上抛，谁调用的，谁需要解决这个异常
	}
	
	void method3() {
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void method4() throws IOException {
		method2();
	}
	
	void method5() {
//		throw new IOException();//throw：抛出异常
//		throw new 
	}
	
}
