package com.dy.edu0725.file;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test04 {

	public static void main(String[] args) throws Exception {
		
		//节点流（基础流/普通流）：从特定数据源读写数据的类叫做节点流类
		//处理流（高级流/特殊流）：必须要有节点流（基础流/普通流）
		//OutputStreamWriter：是字符流通向字节流的桥梁，可以指定charset字符集
		
		//节点流（基础流）
		FileOutputStream fops = new FileOutputStream("E:\\iotest\\aaa.txt");
		
		//处理流（高级流）
		//默认字符集：gbk。
		//写、读必须统一字符，editplus，ultraedit
		OutputStreamWriter osw = new OutputStreamWriter(fops, "GBK");
		osw.write("你好");
		osw.flush();
		osw.close();
		fops.close();
		
	}
	
}
