package com.dy.edu0725.file;

import java.io.File;
import java.io.FileWriter;

public class Test01 {

	//�ַ���--->�����ַ�
	//FileWriter
	public static void main(String[] args) throws Exception {
		
		/*String s = "������ʮ�а˾ţ����һ���ͺã�֪�㳣��";
		char[] carray = s.toCharArray();*/
		char[] carray = new char[] {'h', 'e', 'l', 'l', 'o'};
		File f_1 = new File("E:\\iotest\\aaa.txt");
		FileWriter fw_1 = new FileWriter(f_1, true);
		
		fw_1.write(99);
		fw_1.write(carray);
		//������          
		fw_1.flush();
//		fw_1.close();//Ĭ����������flush()�������ٹر�
		
	}
	
}
