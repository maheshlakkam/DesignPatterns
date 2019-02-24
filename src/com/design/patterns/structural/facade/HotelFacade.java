package com.design.patterns.structural.facade;

public class HotelFacade {
	public Menu getVegMenu() {
		VegRestaurant vegRest = new VegRestaurant();
		return vegRest.getMenu();
	}
	public Menu getNonVegMenu() {
		NonVegRestaurant nonVegRest = new NonVegRestaurant();
		return nonVegRest.getMenu();
	}
}
