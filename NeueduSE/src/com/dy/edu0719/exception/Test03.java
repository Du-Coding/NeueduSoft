package com.dy.edu0719.exception;

public class Test03 {

	public static void main(String[] args) {

		int[] a = new int[10];
		
		for(int i = 0; i < 10; i++) {
			if(i <= 6) {
				a[i] = i;
				System.out.print(a[i] + " ");
			}else {
				try {
					throw new Exceprion03();
				} catch (Exceprion03 e) {
					// TODO Auto-generated catch block
					e.say();
				}
			}
			
		}
		
	}
	
}
