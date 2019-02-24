package com.design.patterns.structural.adapter.map.example;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAdapter extends AbstractMap<String, String>{
	private Map<String, String> map;
	
	public MapAdapter(String[][] array) {
		super();
		map = new HashMap<String, String>();
		for(String[] mapping : array) {
			map.put(mapping[0], mapping[1]);
		}
	}
	
	@Override
	public Set entrySet() {
		return map.entrySet();
	}

}
