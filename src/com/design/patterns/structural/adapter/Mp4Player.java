package com.design.patterns.structural.adapter;

public class Mp4Player implements AdvancedPlayer {

	@Override
	public void playAll() {
		System.out.println("Play All formats");
	}

}
