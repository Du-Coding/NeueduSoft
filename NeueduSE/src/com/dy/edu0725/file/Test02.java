package com.dy.edu0725.file;

import java.io.File;
import java.io.FileReader;

public class Test02 {
	
	//字符流--->处理字符
	//FileReader
	public static void main(String[] args) throws Exception {
		
		//读文件
		char[] carray = new char[1024];
		
		File f_1 = new File("E:\\iotest\\aaa.txt");
		FileReader fr_1 = new FileReader(f_1);
		
		while(fr_1.read(carray) != -1) {
			String s = new String(carray);
			System.out.println(s);
		}
		
		fr_1.close();
		
	}
	
}
