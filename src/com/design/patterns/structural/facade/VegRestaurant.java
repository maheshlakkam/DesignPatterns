package com.design.patterns.structural.facade;

public class VegRestaurant implements Hotel{
	public Menu getMenu() {
		Menu menu = new Menu();
		menu.setItem("xyz");
		menu.setType("Veg");
		menu.setPrice(50);
		return menu;
	}
}
