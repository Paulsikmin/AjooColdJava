package org.ajoo.day11.music.controller;

import java.util.ArrayList;
import java.util.List;

import org.ajoo.day11.music.model.vo.Music;

public class MusicController {
	List<Music> musicList;
	
	public MusicController() {
		musicList = new ArrayList<Music>();
	}
	
	public void addMusicAtFirst(Music music) {
		
	}
	public void addMusicAtLast(Music music) {
		
	}
	
	public List<Music> printAllMusics() {
		return musicList;
	}
}
