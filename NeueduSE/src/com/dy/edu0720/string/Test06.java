package com.dy.edu0720.string;

public class Test06 {

	public static void main(String[] args) {
		
		//��String����ת��ΪStringBuffer����
		//1����������StringBuffer(String s)
		String a = "abc";
		StringBuffer sb = new StringBuffer(a);
		sb.append("bcd");
		System.out.println(sb.toString());
		//2��append(String s)
		StringBuffer sb2 = new StringBuffer(a);
		sb2.append(a);
		System.out.println(sb2);
		//StringBuffer
		//׷��
		sb2.append("ghj");
		System.out.println(sb2);
		System.out.println(sb2.hashCode());
		//����
		sb2.insert(2, "tom");
		System.out.println(sb2);
		//ɾ��
		sb2.delete(2, 5);
		System.out.println(sb2);
		//��ѯ
		System.out.println(sb2.indexOf("b"));
		//�޸�
		sb2.replace(0, 5, "45678");
		System.out.println(sb2);
		
		
//		StringBuffer ����ת��ΪString����StringBuffer��toString()����
		String b = sb.toString();
		
	}
	
}
