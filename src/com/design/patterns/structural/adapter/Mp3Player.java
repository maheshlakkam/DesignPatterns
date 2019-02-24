package com.design.patterns.structural.adapter;

public class Mp3Player implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Play MP3 format");
	}

}
