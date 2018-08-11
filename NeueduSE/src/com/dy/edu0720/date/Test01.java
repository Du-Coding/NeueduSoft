package com.dy.edu0720.date;

import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		
		//new Date(): ���ϵͳ��ǰʱ��
		Date date = new Date();
		System.out.println(date);
		
		//�ѹ�ʱ
		Date d = new Date(110, 7, 20);
		System.out.println(d);
		
		//����date����ǰʱ�䣩��d��ָ��ʱ�䣩֮��
		System.out.println(date.after(d));
		System.out.println(date.before(d));
		//�Ȳ�����afterҲ������before
		System.out.println(date.after(date));
		System.out.println(date.before(date));
		
		//date��d�Ƚϣ����date>d���������������date < d���ظ��������date=d����0
		System.out.println(date.compareTo(d));
		System.out.println(d.compareTo(date));
		System.out.println(d.compareTo(d));
		//����equals�ж������Ƿ����
		System.out.println(date.equals(d));
		
		//getTime()
		System.out.println(date.getTime());
		d.setTime(1532068016001l);
		System.out.println(d);
		
		//��ǰϵͳʱ�䣺UTC+8�����Կ�ʼʱ��Ϊ��1970.1.1 08:00:00
		//����ʱ���ΪUTC�����׼ʱ�� Ϊ��1970.1.1 00:00:00
		d.setTime(0l);
		System.out.println(d);
		//���õ�longֵʵ�����Ǿ���1970.1.1 00:00:00�ĺ���ֵ��
		//1970.1.1 00:00:00��date���ڵ�"���"
		d.setTime(-1000l);
		System.out.println(d);
		
		
	}
	
}
