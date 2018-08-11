package com.dy.edu0720.string;

public class Test07 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		
	}
	
}
