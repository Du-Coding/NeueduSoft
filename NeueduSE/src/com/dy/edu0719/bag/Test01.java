package com.dy.edu0719.bag;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		//��Java.lang���²���Ҫ����
		System.out.println(Math.PI);
		//java.util����
		Scanner sc = new Scanner(System.in);
		//Ĭ�ϵ���toString();
		System.out.println(new Test01().toString());
		
		//==��˫�������
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
