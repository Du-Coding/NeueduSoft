package com.dy.edu0725.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test06 {

	public static void main(String[] args) throws Exception	{
		
		//缓冲流：可以提高I/O的读写速度
		//字节缓冲流：BufferedOutputStream（父类：java.io.OutputStream--->java.io.FilterOutputStream）,BufferedInputStream
		//原理：新建一个byte类型数组
		//可以绑定字节输出流，被传入的字节流在传输时可以提高效率。需要使用基础流：BufferedOutputStream(OutputStream ops);
		//字符缓冲流：BufferedReader（父类：java.io.Reader）,BufferedWriter（父类：java.io.Writer）
		//char类型数组，BufferedWiter(Writer w)
		
		FileOutputStream fos = new FileOutputStream("E:\\iotest\\aaa.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//解码操作
		bos.write("滚".getBytes());
		bos.close();
		fos.close();
		
		
	}
	
}
