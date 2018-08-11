package com.dy.edu0720.math;

public class Test01 {

	public static void main(String[] args) {
		
//		System.out.println(Math.abs(-10));
//		
//		double a = 0.999;
//		System.out.println(Math.floor(a));
//		System.out.println(Math.ceil(a));
//		
//		int b = 10;
//		int b2 = 14;
//		System.out.println(Math.max(b, b2));
//		System.out.println(Math.min(b, b2));
		
		//冒泡排序：int[] a = {34, 45, 67, 49, 97, 43, 89, 3, 113}.
		//从大到小冒泡排序：不会。。。。
		//单例模式：不会。。。。
				
		int[] c = {34, 45, 67, 49, 97, 43, 89, 3, 113};
		for(int i = 0; i < c.length-1; i++) {
			for(int j = 0; j < c.length-i-1; j++) {
				if (c[j] < c[j + 1]) {
					int temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		for(int num : c) {
			System.out.println(num);
		}
	}
	
}
