package com.dy.edu0719.bag;

public class Test03 {

	public static void main(String[] args) {
		
		System.out.print(Byte.MAX_VALUE + " ");
		System.out.println(Byte.MIN_VALUE);
		
		System.out.print(Short.MAX_VALUE + " ");
		System.out.println(Short.MIN_VALUE);
		
		System.out.print(Integer.MAX_VALUE + " ");
		System.out.println(Integer.MIN_VALUE);
		
		System.out.print(Long.MAX_VALUE + " ");
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Character.isDigit('8'));
		
		int a = 10;
		Integer a2 = new Integer(10);
		Integer a3 = new Integer("10");
		System.out.println(a3);
		//Integer的valueOf方法可以将其他数据类型转换为Integer类型。
		Integer a4 = Integer.valueOf(10);
		Integer a5 = Integer.valueOf("99");
		System.out.println(a4 + " " + a5);
		//Integer的intValue/longValue方法可以将自己转换为对应的基本类型
		int a6 = a3.intValue();
		long a7 = a3.longValue();
		
		int b1 = 10;
		Integer b2 = b1;//基本数据类型直接转换为包装数据类型叫自动装箱
		int b3 = b2;//从包装数据类型直接转换为基本数据类型叫自动开箱
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.equals(s2));
		
	}
	
}
