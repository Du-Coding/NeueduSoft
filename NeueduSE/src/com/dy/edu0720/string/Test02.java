package com.dy.edu0720.string;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		
//		String a = "abcdecd";
//		//a.substring(n, m)：打印m-n个
//		System.out.println(a.substring(0, 3));
//		
//		//indexOf("", n) n表示从n开始检索
//		System.out.println(a.indexOf("cd"));
//		System.out.println(a.indexOf("cd", 3));
//		
//		String b = "    asdsc   ";
//		System.out.println(b.trim());
//		
//		System.out.println(a.concat(b).trim());
		int[] num = new int[6]; 
		int bnum = (int)(16*Math.random()+1);
		for (int i = 0; i < 6; i++) {
			while(true){
			   int ran = (int)(33*Math.random()+1);
			   for(int j = 0 ; j < i ; j++){
				   if(num[j] == ran) {
					   ran = -1;
					   break;
				   } 
			   }
			   if(ran != -1){
				   num[i] = ran;
				   break;
			   }
			}
		}
//		String a = Arrays.toString(num);
//		String[] b = a.split(",");
//		for(String c : b) {
//			System.out.println(c);
//		}
//		System.out.println(a);
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < num.length; i++) {
			 sb = sb.append(num[i] + ",");
		}
		String a = sb.toString();
		System.out.println(a);
		
		String[] b = a.split(",");
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
	
}
