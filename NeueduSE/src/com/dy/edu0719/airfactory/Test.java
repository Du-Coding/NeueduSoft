package com.dy.edu0719.airfactory;

public class Test {

	public static void main(String[] args) {
		
		//工厂模式与抽象工厂模式的区别
				/*
				 * 工厂方法模式：
		一个抽象产品类，可以派生出多个具体产品类。   
		一个抽象工厂类，可以派生出多个具体工厂类。   
		每个具体工厂类只能创建一个具体产品类的实例。
		抽象工厂模式：
		多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。   
		一个抽象工厂类，可以派生出多个具体工厂类。   
		每个具体工厂类可以创建多个具体产品类的实例。   
		区别：
		工厂方法模式只有一个抽象产品类，而抽象工厂模式有多个。   
		工厂方法模式的具体工厂类只能创建一个具体产品类的实例，而抽象工厂模式可以创建多个。
		两者皆可。 
		*/
					FactoryAbstractBMW320 b320f=new FactoryAbstractBMW320();
					ConditionA a320= (ConditionA)b320f.getCondition();
					EngineA e320=(EngineA) b320f.getEngine();
					
					FactoryAbstractBMW523 b523f=new FactoryAbstractBMW523();
					ConditionB a523= (ConditionB)b523f.getCondition();
					EngineB e523=(EngineB) b523f.getEngine();
		
	}
	
}
