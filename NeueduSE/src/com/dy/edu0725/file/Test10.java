package com.dy.edu0725.file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test10 {

	public static void main(String[] args) throws Exception{
		//���Object����ĳ�����Բ��뱻���л����������ַ�ʽ��
		//1��static���η����ھ�̬��������
		//2��transient���η���
		//���л������������л����ֽ������߼�������ObjectInputStream��ObjectOutputStream
		//ʵ�����л��ӿڣ�ָ����implements Serializable�ӿ�----->SerializableUID
		Person ly = new Person();
		ly.setName("����");
		ly.setAge(28);
		
		//���л��������л�/�����л�
		//���л���ObjectOutputStream�����ڴ�--->��棬���ࣺjava.io.OutputStream ---->java.io.ObjectOutputStream
		//�����л���ObjectInputStream�������--->�ڴ�,���ࣺjava.io.InputStream ---->java.io.ObjectInputStream
		//������ѧУ�����Ա�˫ʮһ�ĸ߲����������ﳵ�����ݷ�������У���ֹ����������
		
		FileOutputStream fos = new FileOutputStream("E:\\iotest\\aaa.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(ly);
		
		oos.close();
		fos.close();
		
		
	}
	
}
