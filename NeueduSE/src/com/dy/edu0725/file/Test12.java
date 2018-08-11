package com.dy.edu0725.file;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Test12 {

	public static void main(String[] args) throws Exception{
		
		//i/o操作工具包使用
		//copy 文件
		FileUtils.copyFile(new File("E:\\iotest\\aaa.jpg"), new File("E:\\iotest\\bbb.jpg"));
		
		//将字符串copy到文件中
		FileUtils.writeStringToFile(new File("E:\\iotest\\aaa.txt"), "食屎拉你");
		
		//读文本
		String s = FileUtils.readFileToString(new File("E:\\iotest\\aaa.txt"));
		System.out.println(s);
		
	}
	
}
