package com.dy.edu0720.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {

	public static void main(String[] args) throws ParseException {
		
		//由Date转换为String类型的过程
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		sdf.format(new Date());
		System.out.println(sdf.format(new Date()));
		//由String转换为Date类型的过程
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf2.parse("2018-06-20");
		System.out.println(d);
		
	}
	
}
