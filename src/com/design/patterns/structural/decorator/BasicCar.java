package com.design.patterns.structural.decorator;

public class BasicCar implements Car{

	@Override
	public void assemble() {
		System.out.println("Its a basic car");
	}

}
