package com.dy.edu0720.string;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������");
		String s = sc.next();
		System.out.println(s);
		String[] b = s.split(",");
		if(b.length > 4) {
			System.out.println("������");
		}else {
		for(int i = 0; i < b.length-1; i++) {
			for(int j = i+1; j < b.length; j++) {
				if(Integer.parseInt(b[i]) == Integer.parseInt(b[j])) {
					System.out.println("�����ظ�");
					System.out.println("�ظ�ֵΪ��"+ b[j]);
					break;
				}else {
						
				}
			}
		}
		for(int i = 0; i < b.length; i++) {
			if(Integer.parseInt(b[i]) > 33 || Integer.parseInt(b[i]) < 1) {
				System.out.println("������ֵ����:"+b[i]);break;
			}
		}
	}
	}
	
}
