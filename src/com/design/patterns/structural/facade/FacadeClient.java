package com.design.patterns.structural.facade;

public class FacadeClient {
	public static void main(String[] args) {
		HotelFacade facade = new HotelFacade();
		Menu vegMenu = facade.getVegMenu();
		Menu nonVegMenu = facade.getNonVegMenu();
		System.out.println("Veg Menu is:"+vegMenu.item);
		System.out.println("Non Veg Menu is:"+nonVegMenu.item);
	}
}
