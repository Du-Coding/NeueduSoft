package com.dy.edu0720.calendar;

import java.util.Calendar;

public class Test01 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); //��ǰϵͳʱ�����1970��1.1�ĺ�����
		c.set(2016, 05, 12);
		//���ո�ʽ����������ȡ��Ӧ��ʱ������
		//���ָ���������ǵ���ĵڼ���
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		
	}
	
}
