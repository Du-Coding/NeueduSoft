package com.dy.edu0724.file;

import java.io.File;
import java.io.FileInputStream;

public class Test03 {

	public static void main(String[] args) throws Exception {
		
		//输入流：InputStream
		File file_1 = new File("E:\\iotest\\aaa.txt");
		FileInputStream fis = new FileInputStream(file_1);
		
		/*int i_1 = fis.read();
		int i_2 = fis.read();
		int i_3 = fis.read();
		
		System.out.println((char)i_1);
		System.out.println((char)i_2);
		System.out.println((char)i_3);
		
		int i_5 = fis.read();
		System.out.println((char)i_5)
		如果读到了最后，输出结果为-1
		*/;
		int n = 0;
		while((n = fis.read()) != -1) {
			
			System.out.print((char)n + " ");
			
		}
		
		fis.close();
	}
	
}
