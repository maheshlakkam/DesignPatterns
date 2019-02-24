package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

//its a Composite 
public class Drawing implements Shape {
	List<Shape> shapes = new ArrayList<Shape>();

	@Override
	public void draw(String color) {
		for (Shape s : shapes) {
			s.draw(color);
		}
	}

	public void add(Shape s) {
		this.shapes.add(s);
	}

	public void remove(Shape s) {
		shapes.remove(s);
	}

	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
