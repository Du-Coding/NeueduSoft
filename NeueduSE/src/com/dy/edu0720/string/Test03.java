package com.dy.edu0720.string;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入号码");
		String s = sc.next();
		System.out.println(s);
		String[] b = s.split(",");
		if(b.length > 4) {
			System.out.println("数多了");
		}else {
		for(int i = 0; i < b.length-1; i++) {
			for(int j = i+1; j < b.length; j++) {
				if(Integer.parseInt(b[i]) == Integer.parseInt(b[j])) {
					System.out.println("数据重复");
					System.out.println("重复值为："+ b[j]);
					break;
				}else {
						
				}
			}
		}
		for(int i = 0; i < b.length; i++) {
			if(Integer.parseInt(b[i]) > 33 || Integer.parseInt(b[i]) < 1) {
				System.out.println("输入数值过大:"+b[i]);break;
			}
		}
	}
	}
	
}
