package com.design.patterns.structural.composite;
//Its a leaf object
public class Triangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing triangle "+color);
	}

}
