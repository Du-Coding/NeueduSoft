package com.dy.edu0725.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test03 {

	public static void main(String[] args) throws Exception {
		
		//��aaa.txt�е�����copy��bbb.txt��
		//�ֽ�������������----->byte����
		//�ַ�������������----->char����
		File f_1 = new File("E:\\iotest\\aaa.txt");
		File f_2 = new File("E:\\iotest\\bbb.txt");
		
		FileReader fr_1 = new FileReader(f_1);
		FileWriter fw_1 = new FileWriter(f_2);
		int n = 0;
		//��������
		char[] carray = new char[1024];
		//��ȡ����
		while((n = fr_1.read(carray)) != -1) {
			fw_1.write(carray, 0, n);
			fw_1.flush();
		}
		/*while(fr_1.read(carray) != -1) {
			//д������
			String str = new String(carray);
			fw_1.write(str);
		}*/
		fr_1.close();
		fw_1.close();
		System.out.println("���гɹ�");
		
		
	}
	
}
