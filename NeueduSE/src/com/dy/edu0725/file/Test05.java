package com.dy.edu0725.file;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test05 {

	public static void main(String[] args) throws Exception {
		
		//InputStreamReader���ַ���ͨ���ֽ���������
		//��ȡ�ַ�����Ҫһ��
		FileInputStream fis = new FileInputStream("E:\\iotest\\aaa.txt");
		InputStreamReader isr = new InputStreamReader(fis, "GBK");
		
		//�����Сȷ������صĴ�С
		char[] carray = new char[1024];
		while(isr.read(carray) != -1) {
			String s = new String(carray);
			System.out.println(s);
		}
		fis.close();
		isr.close();
		
	}
	
}
