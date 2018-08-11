package com.dy.edu0725.file;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test05 {

	public static void main(String[] args) throws Exception {
		
		//InputStreamReader：字符流通向字节流的桥梁
		//读取字符编码要一致
		FileInputStream fis = new FileInputStream("E:\\iotest\\aaa.txt");
		InputStreamReader isr = new InputStreamReader(fis, "GBK");
		
		//数组大小确定缓冲池的大小
		char[] carray = new char[1024];
		while(isr.read(carray) != -1) {
			String s = new String(carray);
			System.out.println(s);
		}
		fis.close();
		isr.close();
		
	}
	
}
