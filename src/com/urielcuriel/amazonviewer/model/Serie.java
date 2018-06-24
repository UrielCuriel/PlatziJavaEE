package com.urielcuriel.amazonviewer.model;

public class Serie {
	private int id;
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;
	private int seasionQuantity;
	//chapters[]
	/**
	 * @param title
	 * @param genre
	 * @param duration
	 */
	public Serie(String title, String genre, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
	}
}