package com.dy.edu0719.bag;

public class Test04 {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		System.out.println(s3 == s4);
		
		String s5 = "ab" + "c";
		String s6 = "ab" + "c";
		System.out.println(s5.equals("abc"));
		System.out.println(s5 == s1);
		System.out.println(s5 == s6);
		String s7 = "ab" + new String("c");
		System.out.println(s5 == s7);
		String s8 = "ab" + new String("c");
		System.out.println(s7.equals(s8));
		System.out.println(s7 == s8);
		
		String s9 = s1.toUpperCase().toLowerCase();
		System.out.println(s1.equals(s9));
		System.out.println(s1 == s9);
		
		System.out.println("ab".concat("c").equals("abc"));
		System.out.println("ab".concat("c") == "abc");
		
	}
	
}
