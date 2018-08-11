package com.dy.edu0724.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		//д�ַ���ʱ���ж����\��ԭ����ת���ַ�,���ӡ����д��\\��
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);//win�´�ӡΪ��\����linux�´�ӡ��/��
		File f_1 = new File("E:\\iotest\\aaa.txt.txt");
		File f_2 = new File("E:\\iotest");
		File f_3 = new File("E:\\iotest\\bbb.txt");
		
		System.out.println(f_1.exists());
		System.out.println(f_2.exists());
		System.out.println(f_3.exists());
		
		//�������ڶ�Ӧ�ļ�ʱ�������������ǲ������κβ���
		//��ݼ���alt + �ϼ����ƶ����δ���
		boolean b = f_3.createNewFile();
		System.out.println(b);
		
		File f_4 = new File("E:\\iotest\\a1\\b1");
		//�����༶Ŀ¼
		b = f_4.mkdirs();
		System.out.println(b);
		
		File f_5 = new File("E:\\iotest\\a1\\b1\\c1");
		//��������Ŀ¼
		b = f_5.mkdir();
		System.out.println(b);
		
		//ɾ��:���������վ��ֱ��ɾ��
		b = f_5.delete();
		System.out.println(b);
		
		//�޸��ļ���:renameTo(),���ܼ���Ҳ���޸�
		File f_6 = new File("E:\\iotest\\aaa.txt");
		b = f_1.renameTo(f_6);
		
		//getName()���ļ��Ƿ�����޹أ�ʵ��Ϊ��ȡ�ַ���
		System.out.println(f_1.getName());
		System.out.println(f_2.getName());
		System.out.println(f_3.getName());
		System.out.println(f_4.getName());
		
		//jd-gui���Բ鿴.class�ļ������������
		
		///�����ֽ���
		System.out.println(f_3.length());
		
		//�ж��Ƿ�����
		System.out.println(f_3.isHidden());
		
		//��ѯ����޸�ʱ��
		System.out.println(new Date(f_3.lastModified()));
		
		//��ȡ����·��
		System.out.println(f_3.getAbsolutePath());
		
		//��ȡ��·��
		System.out.println(f_3.getParentFile().getParentFile());
		
		//������ǰĿ¼
		String[] s = f_2.list();
		for(String name :s) {
			System.out.println(name);
		}
		
		//������ǰĿ¼�������ļ�
		/*File[] farray_1 = f_2.listFiles();
		for(File file : farray_1) {
			System.out.println(file.getName());
			File[] farray_2 = file.listFiles();
			if(file.exists()) {
				for(File file_2 : farray_2) {
					System.out.println(file_2.getName());
				}
			}
		}*/
		
		File file_7 = new File("D:\\");
		
		System.out.println("@@@@@@@@@@@@@@@@@");
		dgbl(file_7);
	}
	
	public static void dgbl(File file) {
		File[] farray = file.listFiles();
		for(File file_1 : farray) {
			if(file_1.isDirectory()) {
				System.out.println("@@@@@@@@@@@@@@@@@");
				dgbl(file_1);
			} else {
				System.out.println(file.getName());
			}
		}
	}
	
}
