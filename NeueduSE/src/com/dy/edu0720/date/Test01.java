package com.dy.edu0720.date;

import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		
		//new Date(): 获得系统当前时间
		Date date = new Date();
		System.out.println(date);
		
		//已过时
		Date d = new Date(110, 7, 20);
		System.out.println(d);
		
		//测试date（当前时间）在d（指定时间）之后
		System.out.println(date.after(d));
		System.out.println(date.before(d));
		//既不满足after也不满足before
		System.out.println(date.after(date));
		System.out.println(date.before(date));
		
		//date与d比较，如果date>d返回正数，如果的date < d返回负数，如果date=d返回0
		System.out.println(date.compareTo(d));
		System.out.println(d.compareTo(date));
		System.out.println(d.compareTo(d));
		//利用equals判断日期是否相等
		System.out.println(date.equals(d));
		
		//getTime()
		System.out.println(date.getTime());
		d.setTime(1532068016001l);
		System.out.println(d);
		
		//当前系统时间：UTC+8，所以开始时间为：1970.1.1 08:00:00
		//当把时间调为UTC世界标准时间 为：1970.1.1 00:00:00
		d.setTime(0l);
		System.out.println(d);
		//设置的long值实际上是距离1970.1.1 00:00:00的毫秒值。
		//1970.1.1 00:00:00是date日期的"零点"
		d.setTime(-1000l);
		System.out.println(d);
		
		
	}
	
}
