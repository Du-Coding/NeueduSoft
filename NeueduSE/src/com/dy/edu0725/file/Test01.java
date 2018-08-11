package com.dy.edu0725.file;

import java.io.File;
import java.io.FileWriter;

public class Test01 {

	//字符流--->处理字符
	//FileWriter
	public static void main(String[] args) throws Exception {
		
		/*String s = "不如意十有八九，捡得一二就好，知足常乐";
		char[] carray = s.toCharArray();*/
		char[] carray = new char[] {'h', 'e', 'l', 'l', 'o'};
		File f_1 = new File("E:\\iotest\\aaa.txt");
		FileWriter fw_1 = new FileWriter(f_1, true);
		
		fw_1.write(99);
		fw_1.write(carray);
		//缓冲流          
		fw_1.flush();
//		fw_1.close();//默认先运行了flush()方法，再关闭
		
	}
	
}
