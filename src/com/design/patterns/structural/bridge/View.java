package com.design.patterns.structural.bridge;

public abstract class View {
	public Resource resource;

	public View(Resource resource) {
		this.resource = resource;
	}

	public abstract void show();
}
