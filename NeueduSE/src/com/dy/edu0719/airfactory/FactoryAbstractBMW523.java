package com.dy.edu0719.airfactory;

public class FactoryAbstractBMW523 implements BMWFactoryAbstract {

	public Condition getCondition() {
		// TODO Auto-generated method stub
		return new ConditionB();
	}

	public Engine getEngine() {
		// TODO Auto-generated method stub
		return new EngineB();
	}

}
