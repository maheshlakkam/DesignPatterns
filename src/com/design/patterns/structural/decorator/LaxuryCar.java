package com.design.patterns.structural.decorator;

public class LaxuryCar extends CarDecorator{

	public LaxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Laxury features to Basic Car");
	}

}
