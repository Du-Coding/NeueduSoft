package com.dy.edu0725.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test06 {

	public static void main(String[] args) throws Exception	{
		
		//���������������I/O�Ķ�д�ٶ�
		//�ֽڻ�������BufferedOutputStream�����ࣺjava.io.OutputStream--->java.io.FilterOutputStream��,BufferedInputStream
		//ԭ���½�һ��byte��������
		//���԰��ֽ����������������ֽ����ڴ���ʱ�������Ч�ʡ���Ҫʹ�û�������BufferedOutputStream(OutputStream ops);
		//�ַ���������BufferedReader�����ࣺjava.io.Reader��,BufferedWriter�����ࣺjava.io.Writer��
		//char�������飬BufferedWiter(Writer w)
		
		FileOutputStream fos = new FileOutputStream("E:\\iotest\\aaa.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//�������
		bos.write("��".getBytes());
		bos.close();
		fos.close();
		
		
	}
	
}
