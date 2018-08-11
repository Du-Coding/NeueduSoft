package com.dy.edu0725.work;

public class Test01 {

	//µ¥ÀıÄ£Ê½
	private static Test01 instance;
	private Test01() {
		
	}
	public static Test01 getInstance() {
		if(instance == null) {
			instance = new Test01();
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
		//Ã°ÅİÅÅĞò
		int[] a = {1, 2, 3, 4, 5,};
		for(int i = 0; i < a.length-1; i++) {
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
		}
	}
	
}
