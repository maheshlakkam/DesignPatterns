package com.design.patterns.structural.composite;
//Its a leaf object
public class Circle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing circle "+color);
	}

}
