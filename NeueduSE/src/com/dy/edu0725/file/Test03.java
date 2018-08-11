package com.dy.edu0725.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test03 {

	public static void main(String[] args) throws Exception {
		
		//将aaa.txt中的数据copy到bbb.txt中
		//字节流建立缓冲区----->byte数组
		//字符流建立缓冲区----->char数组
		File f_1 = new File("E:\\iotest\\aaa.txt");
		File f_2 = new File("E:\\iotest\\bbb.txt");
		
		FileReader fr_1 = new FileReader(f_1);
		FileWriter fw_1 = new FileWriter(f_2);
		int n = 0;
		//定义数组
		char[] carray = new char[1024];
		//读取数据
		while((n = fr_1.read(carray)) != -1) {
			fw_1.write(carray, 0, n);
			fw_1.flush();
		}
		/*while(fr_1.read(carray) != -1) {
			//写入数据
			String str = new String(carray);
			fw_1.write(str);
		}*/
		fr_1.close();
		fw_1.close();
		System.out.println("运行成功");
		
		
	}
	
}
