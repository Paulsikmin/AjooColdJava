package org.ajoo.day11.music2.model;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	
	// 기본 생성자
	public Music() {}
	
	// 매개변수 있는 생성자
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	// getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	// toString(@Override)
	@Override   
	public String toString() {
		return "Music [제목=" + title + ", 가수명=" + singer + "]";
	}

	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.getTitle());
	}

}








































