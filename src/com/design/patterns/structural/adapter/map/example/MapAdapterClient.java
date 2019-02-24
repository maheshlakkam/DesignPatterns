package com.design.patterns.structural.adapter.map.example;

public class MapAdapterClient {

	public static void main(String[] args) {
		String[][] input= {{"key","value"},{"key1","value1"}};
		MapAdapter adapter = new MapAdapter(input);
		System.out.println(adapter);
		System.out.println(adapter.entrySet());
	}

}
