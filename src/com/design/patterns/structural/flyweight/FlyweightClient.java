package com.design.patterns.structural.flyweight;

public class FlyweightClient {
	private static final String[] colors = { "red", "green" };

	public static void main(String[] args) {

		Circle c = (Circle) ShapeFactory.getCircle(colors[0]);
		c.draw();
		Circle c1 = (Circle) ShapeFactory.getCircle(colors[1]);
		c1.draw();
		Circle c2 = (Circle) ShapeFactory.getCircle(colors[0]);
		c2.draw();
		Circle c3 = (Circle) ShapeFactory.getCircle(colors[1]);
		c3.draw();
		Circle c4 = (Circle) ShapeFactory.getCircle(colors[0]);
		c4.draw();
		Circle c5 = (Circle) ShapeFactory.getCircle(colors[1]);
		c5.draw();
		Circle c6 = (Circle) ShapeFactory.getCircle(colors[0]);
		c6.draw();
		Circle c7 = (Circle) ShapeFactory.getCircle(colors[1]);
		c7.draw();
	}
}
