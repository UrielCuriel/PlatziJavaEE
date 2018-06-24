package com.urielcuriel.amazonviewer.model;

public class Film {
	protected int id;
	protected String title;
	protected String genre;
	protected String creator;
	protected int duration;
	protected short year;
	protected boolean viewed;
	public void showData() {
		System.out.println("Title: "+this.title);
		System.out.println("Genre: "+this.genre);
		System.out.println("Year: "+this.year);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public boolean isViewed() {
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
}
