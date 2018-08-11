package com.dy.edu0720.calendar;

import java.util.Calendar;

public class Test01 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); //当前系统时间距离1970年1.1的毫秒数
		c.set(2016, 05, 12);
		//按照格式（常量）获取对应的时间数据
		//获得指定年月日是当年的第几天
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		
	}
	
}
