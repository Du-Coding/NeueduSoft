package com.dy.edu0725.file;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Test12 {

	public static void main(String[] args) throws Exception{
		
		//i/o�������߰�ʹ��
		//copy �ļ�
		FileUtils.copyFile(new File("E:\\iotest\\aaa.jpg"), new File("E:\\iotest\\bbb.jpg"));
		
		//���ַ���copy���ļ���
		FileUtils.writeStringToFile(new File("E:\\iotest\\aaa.txt"), "ʳʺ����");
		
		//���ı�
		String s = FileUtils.readFileToString(new File("E:\\iotest\\aaa.txt"));
		System.out.println(s);
		
	}
	
}
