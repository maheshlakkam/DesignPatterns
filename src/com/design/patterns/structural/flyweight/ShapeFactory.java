package com.design.patterns.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	private static HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);
		if (circle == null) {
			System.out.println("New Object");
			circle = new Circle(color);
			circleMap.put(color, circle);
		}else {
			System.out.println("Using from Cache");
		}
		return circle;
	}
}
