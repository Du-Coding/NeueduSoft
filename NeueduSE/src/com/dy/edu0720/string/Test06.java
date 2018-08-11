package com.dy.edu0720.string;

public class Test06 {

	public static void main(String[] args) {
		
		//由String类型转换为StringBuffer类型
		//1、构造器：StringBuffer(String s)
		String a = "abc";
		StringBuffer sb = new StringBuffer(a);
		sb.append("bcd");
		System.out.println(sb.toString());
		//2、append(String s)
		StringBuffer sb2 = new StringBuffer(a);
		sb2.append(a);
		System.out.println(sb2);
		//StringBuffer
		//追加
		sb2.append("ghj");
		System.out.println(sb2);
		System.out.println(sb2.hashCode());
		//插入
		sb2.insert(2, "tom");
		System.out.println(sb2);
		//删除
		sb2.delete(2, 5);
		System.out.println(sb2);
		//查询
		System.out.println(sb2.indexOf("b"));
		//修改
		sb2.replace(0, 5, "45678");
		System.out.println(sb2);
		
		
//		StringBuffer 类型转换为String：用StringBuffer的toString()方法
		String b = sb.toString();
		
	}
	
}
