package com.dy.edu0723.collection;

import java.util.Arrays;

public class Test01 {

	//������չ
	public static void main(String[] args) {
		
		//���鶨���������Զ�����
		int[] a = {12, 23, 43, 45};
		System.out.println(a);
		System.out.println(a.length);
		
		int[] b = new int[5];
		System.out.println(b.length);
		
//		a[5] = 30;
//		System.out.println(a[5]);
		
		//�������ݣ��·���һ���ڴ��ַ
		a = Arrays.copyOf(a, 10);
		System.out.println(a);
		System.out.println(a.length);
		
		//�����е�copy�����������������飩
		//a(src):ԭ����
		//0��srcPos����ԭ���鿪ʼλ��
		//b��dest����Ŀ������
		//0��destPos����Ŀ�����鿪ʼλ��
		//5��length����Ԫ��copy����
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
