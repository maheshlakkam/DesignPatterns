package com.design.patterns.structural.facade;

public class NonVegRestaurant implements Hotel {
	@Override
	public Menu getMenu() {
		Menu menu = new Menu();
		menu.setItem("abc");
		menu.setType("NonVeg");
		menu.setPrice(123);
		return menu;
	}
}
