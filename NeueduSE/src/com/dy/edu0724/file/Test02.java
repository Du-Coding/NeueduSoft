package com.dy.edu0724.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test02 {

	public static void main(String[] args) throws Exception {
		
		/*
		 I/O流：按流的方向不同 （输入流、输出流）
		 	        按处理数据的单位不同（字符流、字节流）
		 	        按功能不同 （节点流、处理流  ）   
		 参照物：内存
		 输出流：outputStream：将数据从内存写到外存
		 输入流：inputStream：将数据从外存写入内存
		 字节流（byte)：可以操作任何数据文字、图片、视频，在计算机中任何文件都已字节进行存储
		 			 常见的字节流：outputStream、inputStream
		 字符流：只能操作字符数据
		 	      常见的字符流：Reader、Writer
		*/
		
		//OutputStream是输出流的父类
		File file_1 = new File("E:\\iotest\\aaa.txt");
		OutputStream out_1 = null;
		//换行符\r\n
		String s1 = "Hello World \r\n";
		String s2 = "Thank you very much";
		//文件续写，参数改为true，默认值为false，不续写
		out_1 = new FileOutputStream(file_1, true);
		out_1.write(97);
		out_1.write(s1.getBytes());
		out_1.write(s2.getBytes());
		System.out.println("书写成功");
		if(out_1 != null) {
			out_1.close();
		}
		
		
	}
	
}
