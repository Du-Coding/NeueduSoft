package com.dy.edu0725.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test09 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("E:\\iotest\\aaa.txt");
		BufferedReader br = new BufferedReader(fr);
		
		/*char[] carray = new char[64];
		while(br.read(carray) != -1) {
			String s = new String(carray);
			System.out.println(s);
		}*/
		
		String s = null;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		
		br.close();
		fr.close();
	}
	
}
