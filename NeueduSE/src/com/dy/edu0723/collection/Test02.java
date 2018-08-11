package com.dy.edu0723.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test02 {

	public static void main(String[] args) {
		
		
		Collection c = new ArrayList<>();//集合可以自动的扩容
		//Object ---> 超类，也是包装数据类型的超类
		//基本数据类型--->可以自动装箱：int 10 ----> Integer
		//Object是包装数据类型的超类，Integer 10---> Object类型的父类引用指向子类对象的形式
		//所以 10 可以放在方法当中
		c.add(10);
		c.add(20);
		c.add(30);
		System.out.println(c.size());
		Object[] oarray = c.toArray();
		//遍历Object集合
		for (Object a : oarray) {
			//在syytem.out.println()当中输出一个类相当于自动调用toString()方法
			//因为有了父类引用指向子类对象的形成：Object a = new Integer(),
			//所以 调用toString()方法时发生重写，实际调用的是Integer当中的toString()方法.即输出数字10
			System.out.println(a);
			
		}
		
	}
	
}
