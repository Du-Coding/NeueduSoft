package com.dy.edu0725.file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test11 {

	public static void main(String[] args) throws Exception {
		
		//�����л�
		//�����л���ObjectInputStream�������--->�ڴ�,���ࣺjava.io.InputStream ---->java.io.ObjectInputStream
		
		FileInputStream fis = new FileInputStream("E:\\iotest\\aaa.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		Person person = (Person) obj;
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
		ois.close();
		fis.close();

	}
	
}
