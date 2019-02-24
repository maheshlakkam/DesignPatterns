package com.design.patterns.structural.decorator;

public class DecoratorClient {
	public static void main(String[] args) {
		Car sports = new SportsCar(new BasicCar());
		sports.assemble();
		System.out.println("****Car is ready****");
		Car laxury = new LaxuryCar(new BasicCar());
		laxury.assemble();
		System.out.println("****Car is ready****");
		Car sportLaxuryCar = new SportsCar(new LaxuryCar(new BasicCar()));
		sportLaxuryCar.assemble();
		System.out.println("****Car is ready****");
	}
}
