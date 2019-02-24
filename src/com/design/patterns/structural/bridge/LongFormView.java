package com.design.patterns.structural.bridge;

public class LongFormView extends View {

	public LongFormView(Resource resource) {
		super(resource);
	}

	@Override
	public void show() {
		System.out.println("Long Form Show");
		this.resource.snippet();
	}

}
