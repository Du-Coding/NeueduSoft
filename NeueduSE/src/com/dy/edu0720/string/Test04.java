package com.dy.edu0720.string;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入表达式");
		String a = sc.next();
		
		if(a.indexOf("+") >= 0) {
			String[] b = a.split("[+]");
			int c = Integer.parseInt(b[0]) + Integer.parseInt(b[1]);
			System.out.println(c);
		}
	}
	
}
