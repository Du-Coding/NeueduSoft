package com.dy.edu0724.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.NetworkChannel;

public class Test04 {

	public static void main(String[] args) throws Exception {
		
		//��aaa�е����ݿ�����bbb��
		File file_1 = new File("E:\\iotest\\aaa.jpg");
		File file_2 = new File("E:\\iotest\\bbb.jpg");
		
		//��ȡaaa�е����ݣ�����浽�ڴ�---->input
		FileInputStream fis_1 = new FileInputStream(file_1);
		FileOutputStream fos_1 = new FileOutputStream(file_2, true);
		
		int n = 0;
		byte[] b1 = new byte[1024*1024];//�������˲�������װ����ֽ�
		
		//�����ļ�����
		while((n = fis_1.read(b1)) != -1) {
			fos_1.write(b1);
		}
		
		//�ر�I/O��
		fis_1.close();
		fos_1.close();
		
		System.out.println("���гɹ�");
		
	}
	
}
