package com.design.patterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements Internet {

	Internet internet = new InternetImp();
	List<String> blockedSites = Arrays.asList("a1.com", "a2.com");

	@Override
	public void connectTo(String site) throws Exception {
		if (blockedSites.contains(site)) {
			throw new Exception("Site has been blocked");
		}
		internet.connectTo(site);
	}

}
