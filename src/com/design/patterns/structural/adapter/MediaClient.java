package com.design.patterns.structural.adapter;

public class MediaClient {
	public static void main(String[] args) {
		Adapter adp = new Adapter(new Mp4Player());
		adp.play();
	}
}
