package com.dy.edu0724.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test02 {

	public static void main(String[] args) throws Exception {
		
		/*
		 I/O���������ķ���ͬ �����������������
		 	        ���������ݵĵ�λ��ͬ���ַ������ֽ�����
		 	        �����ܲ�ͬ ���ڵ�����������  ��   
		 ������ڴ�
		 �������outputStream�������ݴ��ڴ�д�����
		 ��������inputStream�������ݴ����д���ڴ�
		 �ֽ�����byte)�����Բ����κ��������֡�ͼƬ����Ƶ���ڼ�������κ��ļ������ֽڽ��д洢
		 			 �������ֽ�����outputStream��inputStream
		 �ַ�����ֻ�ܲ����ַ�����
		 	      �������ַ�����Reader��Writer
		*/
		
		//OutputStream��������ĸ���
		File file_1 = new File("E:\\iotest\\aaa.txt");
		OutputStream out_1 = null;
		//���з�\r\n
		String s1 = "Hello World \r\n";
		String s2 = "Thank you very much";
		//�ļ���д��������Ϊtrue��Ĭ��ֵΪfalse������д
		out_1 = new FileOutputStream(file_1, true);
		out_1.write(97);
		out_1.write(s1.getBytes());
		out_1.write(s2.getBytes());
		System.out.println("��д�ɹ�");
		if(out_1 != null) {
			out_1.close();
		}
		
		
	}
	
}
