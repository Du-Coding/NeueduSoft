package com.dy.edu0723.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Test01 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.addElement("aaa");
		v.addElement("bbb");
		v.addElement("ccc");
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		
		}
		
	}
	
}
