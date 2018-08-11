package com.dy.edu0724.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.NetworkChannel;

public class Test04 {

	public static void main(String[] args) throws Exception {
		
		//将aaa中的内容拷贝到bbb中
		File file_1 = new File("E:\\iotest\\aaa.jpg");
		File file_2 = new File("E:\\iotest\\bbb.jpg");
		
		//读取aaa中的数据，从外存到内存---->input
		FileInputStream fis_1 = new FileInputStream(file_1);
		FileOutputStream fos_1 = new FileOutputStream(file_2, true);
		
		int n = 0;
		byte[] b1 = new byte[1024*1024];//容器，此操作可以装多个字节
		
		//遍历文件内容
		while((n = fis_1.read(b1)) != -1) {
			fos_1.write(b1);
		}
		
		//关闭I/O流
		fis_1.close();
		fos_1.close();
		
		System.out.println("运行成功");
		
	}
	
}
