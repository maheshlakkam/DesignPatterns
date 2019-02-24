package com.design.patterns.structural.adapter;

public class Adapter implements MediaPlayer {
	private AdvancedPlayer advPlayer;
	Adapter(AdvancedPlayer advPlayer){
		this.advPlayer = new Mp4Player();
	}
	public void play() {
		advPlayer.playAll();
	}
}
