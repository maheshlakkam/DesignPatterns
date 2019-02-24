package com.design.patterns.structural.proxy;

public class ProxyClient {

	public static void main(String[] args) {
		Internet internet = new InternetProxy();
		try {
			internet.connectTo("google.com");
			internet.connectTo("a1.com");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
