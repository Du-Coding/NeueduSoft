package com.dy.edu0720.string;

public class Test01 {

	public static void main(String[] args) {
	
		String a = "abcde";
		char[] b = {'a', 'b', 'c', 'd', 'e'};
		
		String c1 = null;
		char[] c2 = new char[5];
		
		
		//String ------> char[]:String的toCharArray()方法
		c2 = a.toCharArray();
		for(char n : c2) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		//char[] ------->String:
		//1、string的valueOf(char[])方法
		c1 = String.valueOf(b);
		System.out.println(c1);
		//2、String的构造方法 new String(char[]);
		String c3 = new String(b);
		System.out.println(c3);
		String c4 = new String(b, 1, 2);
		System.out.println(c4);
		//3、
		String c5 = "a" + "b";
		System.out.println(c5);
		String c6 = null;
		for(char n : b) {
			c6 = c6 + n;
		}
		System.out.println(c6);
		
		
	}
	
	
}
