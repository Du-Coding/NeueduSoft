package com.dy.edu0723.collection;

import java.util.Arrays;

public class Test01 {

	//数组扩展
	public static void main(String[] args) {
		
		//数组定长，不能自动扩容
		int[] a = {12, 23, 43, 45};
		System.out.println(a);
		System.out.println(a.length);
		
		int[] b = new int[5];
		System.out.println(b.length);
		
//		a[5] = 30;
//		System.out.println(a[5]);
		
		//数组扩容，新分配一块内存地址
		a = Arrays.copyOf(a, 10);
		System.out.println(a);
		System.out.println(a.length);
		
		//数组中的copy方法（不能扩容数组）
		//a(src):原数组
		//0（srcPos）：原数组开始位置
		//b（dest）：目标数组
		//0（destPos）：目标数组开始位置
		//5（length）：元素copy个数
//		System.arraycopy(a, 0, b, 0, 5);
//		for (int c : a) {
//			System.out.println(c);
//		}
//		
//		for (int c : b) {
//			System.out.println(c);
//		}
		
	}
	
}
