package com.dy.edu0719.airfactory;

public class Test {

	public static void main(String[] args) {
		
		//����ģʽ����󹤳�ģʽ������
				/*
				 * ��������ģʽ��
		һ�������Ʒ�࣬������������������Ʒ�ࡣ   
		һ�����󹤳��࣬����������������幤���ࡣ   
		ÿ�����幤����ֻ�ܴ���һ�������Ʒ���ʵ����
		���󹤳�ģʽ��
		��������Ʒ�࣬ÿ�������Ʒ�������������������Ʒ�ࡣ   
		һ�����󹤳��࣬����������������幤���ࡣ   
		ÿ�����幤������Դ�����������Ʒ���ʵ����   
		����
		��������ģʽֻ��һ�������Ʒ�࣬�����󹤳�ģʽ�ж����   
		��������ģʽ�ľ��幤����ֻ�ܴ���һ�������Ʒ���ʵ���������󹤳�ģʽ���Դ��������
		���߽Կɡ� 
		*/
					FactoryAbstractBMW320 b320f=new FactoryAbstractBMW320();
					ConditionA a320= (ConditionA)b320f.getCondition();
					EngineA e320=(EngineA) b320f.getEngine();
					
					FactoryAbstractBMW523 b523f=new FactoryAbstractBMW523();
					ConditionB a523= (ConditionB)b523f.getCondition();
					EngineB e523=(EngineB) b523f.getEngine();
		
	}
	
}
