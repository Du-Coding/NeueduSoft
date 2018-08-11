package com.dy.edu0724.only;

import java.util.Scanner;

public class Test01 {

	int a = 0;
	//单例模式例子
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
		//冒泡排序
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

	public int[] input() {//返回输入数据的int数组
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字，用逗号分隔");
		String s = sc.next();
		String[] array = s.split(",");
		int[] intarray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			intarray[i] = Integer.parseInt(array[i]);
		}
		
		return intarray;//返回输入个数
	}
	public void loop(int[] a, int[] b) {//画圆环 a[]最多装10个，b[]装模拟数据
		for(int i = 0; i < b.length; i++) {
			this.a = i % 10;
			a[this.a] = b[i];
		}
	}
	
}
