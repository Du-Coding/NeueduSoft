package com.dy.edu0725.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Test07 {

	public static void main(String[] args) throws Exception {
		
		// π”√BufferedInputStream∂¡»°aaa.txt
		FileInputStream fis = new FileInputStream("E:\\iotest\\aaa.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		byte[] barray = new byte[10];
		while(bis.read(barray) != -1) {
			String s = new String(barray);
			System.out.println(s);
		}
		
		bis.close();
		fis.close();
		
	}
	
}
