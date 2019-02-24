package com.design.patterns.structural.bridge;

public class BridgeClient {
	public static void main(String[] args) {
		View v = new LongFormView(new ArtistResource());
		v.show();
	}
}
