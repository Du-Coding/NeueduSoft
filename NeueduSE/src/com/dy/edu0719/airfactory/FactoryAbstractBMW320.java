package com.dy.edu0719.airfactory;

public class FactoryAbstractBMW320 implements BMWFactoryAbstract{

	public Condition getCondition() {
		// TODO Auto-generated method stub
		return new ConditionA();
	}

	@Override
	public Engine getEngine() {
		// TODO Auto-generated method stub
		return new EngineA();
	}

}
