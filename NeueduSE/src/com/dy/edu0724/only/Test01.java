package com.dy.edu0724.only;

import java.util.Scanner;

public class Test01 {

	int a = 0;
	//����ģʽ����
	private Test01() {
		
	}
	
	private static Test01 instance = null;
	
	public static Test01 getInstance() {
		if (instance == null) {	
				if(instance == null) {
					instance = new Test01();
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		//ð������
		/*int[] a = {2, 3, 4, 45, 98, 1, 22, 11};
		for (int i = 0; i < a.length-1; i++) {
			for(int j = 0; j < a.length-i-1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for(int b : a) {
			System.out.println(b);
		}*/
		
		Test01 t = new Test01();
		int[] a = new int[10];
		int[] b = t.input();
		for(int n : b) {
			System.out.println(n);
		}
		t.loop(a, b);
		for(int n : a) {
			System.out.println(n);
		}
	}

	public int[] input() {//�����������ݵ�int����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������֣��ö��ŷָ�");
		String s = sc.next();
		String[] array = s.split(",");
		int[] intarray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			intarray[i] = Integer.parseInt(array[i]);
		}
		
		return intarray;//�����������
	}
	public void loop(int[] a, int[] b) {//��Բ�� a[]���װ10����b[]װģ������
		for(int i = 0; i < b.length; i++) {
			this.a = i % 10;
			a[this.a] = b[i];
		}
	}
	
}
