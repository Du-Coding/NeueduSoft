package com.dy.edu0725.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test08 {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw = new FileWriter("E:\\iotest\\aaa.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("我系古天乐\r\n".toCharArray());
		bw.newLine();//分隔符
		bw.write("我系渣渣辉\r\n".toCharArray());
		bw.newLine();
		bw.write("贪玩蓝月\r\n".toCharArray());
		bw.newLine();
		bw.write("你没玩过的全新版本\r\n".toCharArray());
		bw.newLine();
		bw.write("系兄弟，就来砍我\r\n".toCharArray());
		bw.close();
		fw.close();
		
		
	}
	
}

