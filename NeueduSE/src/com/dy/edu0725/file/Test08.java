package com.dy.edu0725.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test08 {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw = new FileWriter("E:\\iotest\\aaa.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("��ϵ������\r\n".toCharArray());
		bw.newLine();//�ָ���
		bw.write("��ϵ������\r\n".toCharArray());
		bw.newLine();
		bw.write("̰������\r\n".toCharArray());
		bw.newLine();
		bw.write("��û�����ȫ�°汾\r\n".toCharArray());
		bw.newLine();
		bw.write("ϵ�ֵܣ���������\r\n".toCharArray());
		bw.close();
		fw.close();
		
		
	}
	
}

