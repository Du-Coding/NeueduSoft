package com.dy.edu0720.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {

	public static void main(String[] args) throws ParseException {
		
		//��Dateת��ΪString���͵Ĺ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		sdf.format(new Date());
		System.out.println(sdf.format(new Date()));
		//��Stringת��ΪDate���͵Ĺ���
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf2.parse("2018-06-20");
		System.out.println(d);
		
	}
	
}
