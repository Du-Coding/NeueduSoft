package com.dy.edu0724.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		//写字符串时，有多个“\”原因是转义字符,想打印，需写“\\”
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);//win下打印为“\”，linux下打印“/”
		File f_1 = new File("E:\\iotest\\aaa.txt.txt");
		File f_2 = new File("E:\\iotest");
		File f_3 = new File("E:\\iotest\\bbb.txt");
		
		System.out.println(f_1.exists());
		System.out.println(f_2.exists());
		System.out.println(f_3.exists());
		
		//当不存在对应文件时创建，而存在是不进行任何操作
		//快捷键：alt + 上键，移动整段代码
		boolean b = f_3.createNewFile();
		System.out.println(b);
		
		File f_4 = new File("E:\\iotest\\a1\\b1");
		//创建多级目录
		b = f_4.mkdirs();
		System.out.println(b);
		
		File f_5 = new File("E:\\iotest\\a1\\b1\\c1");
		//创建单级目录
		b = f_5.mkdir();
		System.out.println(b);
		
		//删除:不进入回收站，直接删除
		b = f_5.delete();
		System.out.println(b);
		
		//修改文件名:renameTo(),既能剪切也能修改
		File f_6 = new File("E:\\iotest\\aaa.txt");
		b = f_1.renameTo(f_6);
		
		//getName()与文件是否存在无关，实际为截取字符串
		System.out.println(f_1.getName());
		System.out.println(f_2.getName());
		System.out.println(f_3.getName());
		System.out.println(f_4.getName());
		
		//jd-gui可以查看.class文件，反编译软件
		
		///返回字节数
		System.out.println(f_3.length());
		
		//判断是否隐藏
		System.out.println(f_3.isHidden());
		
		//查询最后修改时间
		System.out.println(new Date(f_3.lastModified()));
		
		//获取绝对路径
		System.out.println(f_3.getAbsolutePath());
		
		//获取父路径
		System.out.println(f_3.getParentFile().getParentFile());
		
		//遍历当前目录
		String[] s = f_2.list();
		for(String name :s) {
			System.out.println(name);
		}
		
		//遍历当前目录，返回文件
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
