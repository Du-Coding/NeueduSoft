package com.dy.edu0725.file;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test04 {

	public static void main(String[] args) throws Exception {
		
		//�ڵ�����������/��ͨ���������ض�����Դ��д���ݵ�������ڵ�����
		//���������߼���/��������������Ҫ�нڵ�����������/��ͨ����
		//OutputStreamWriter�����ַ���ͨ���ֽ���������������ָ��charset�ַ���
		
		//�ڵ�������������
		FileOutputStream fops = new FileOutputStream("E:\\iotest\\aaa.txt");
		
		//���������߼�����
		//Ĭ���ַ�����gbk��
		//д��������ͳһ�ַ���editplus��ultraedit
		OutputStreamWriter osw = new OutputStreamWriter(fops, "GBK");
		osw.write("���");
		osw.flush();
		osw.close();
		fops.close();
		
	}
	
}
