package com.dy.edu0720.work;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������");
		String tel = sc.next();
		if(tel.length() > 11 || tel.length() != 11) {
			System.out.println("�ⲻ�����Ǽҵĺ���");
		} else {
			StringBuffer sb = new StringBuffer(tel);
			char[] c = tel.toCharArray();
//			for(int i = 0; i <)
			//sb.replace(3, 7, "****");
			System.out.println(sb.toString());
		}
		
	}
	
}
