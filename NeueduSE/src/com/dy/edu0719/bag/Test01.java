package com.dy.edu0719.bag;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		//在Java.lang包下不需要导包
		System.out.println(Math.PI);
		//java.util包下
		Scanner sc = new Scanner(System.in);
		//默认调用toString();
		System.out.println(new Test01().toString());
		
		//==：双等运算符
		//equals
//		String a = "666";
//		a.equals("aaa");
		
		Test02 test02 = new Test02();
		test02.a=10;
		Test02 t = new Test02();
		System.out.println(test02.equals(t));
		System.out.println(test02.hashCode());
		System.out.println(test02.toString());
		
	}
	
}
