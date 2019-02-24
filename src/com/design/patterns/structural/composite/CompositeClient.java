package com.design.patterns.structural.composite;

public class CompositeClient {
	public static void main(String[] args) {
		Shape t1 = new Triangle();
		Shape t2 = new Triangle();
		Shape c1 = new Circle();

		Drawing drawing = new Drawing();
		drawing.add(t1);
		drawing.add(t2);
		drawing.add(c1);

		drawing.draw("Red");

		drawing.clear();

		drawing.add(t1);
		drawing.add(c1);
		drawing.draw("Green");
	}
}
