package com.dy.edu0719.exception;

import java.io.IOException;

public class Exception01 {

	public static void main(String[] args) {
		//�쳣������ʱ���ֵ�����
		//���󣺱������
		
		//������û�ж��쳣���д���
		//int a = 10/0;
		/*�����±�Խ���쳣 
		int[] a = new int[4];
		System.out.println(a[4]);*/
		
		//���쳣���д���
		//д���catch��˳�򣺸���������֮��
		try {
			int[] a = new int[5];
			System.out.println(a[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("haole");
		}finally {
			System.out.println("����̫try�Ƿ����쳣��catch���쳣������ִ��finally");
		}
		
//		method1();
	}
	static void method1() {
		method1();
	}
	
	void method2() throws IOException {//���ּ�����쳣���������������ʽ��1��try catch 2������throws �쳣����
		System.out.println("��");       //throws�������쳣���п��ܳ���������쳣���ͣ��˷��������쳣������Ҫ�����ף�˭���õģ�˭��Ҫ�������쳣
	}
	
	void method3() {
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void method4() throws IOException {
		method2();
	}
	
	void method5() {
//		throw new IOException();//throw���׳��쳣
//		throw new 
	}
	
}
