package com.design.patterns.structural.proxy;

public class InternetImp implements Internet {

	@Override
	public void connectTo(String site) throws Exception {
		System.out.println("Connecting to " + site);
	}

}
