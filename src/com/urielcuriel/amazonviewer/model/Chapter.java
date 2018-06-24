package com.urielcuriel.amazonviewer.model;

public class Chapter {
	private int id;
	private String title;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;
	private int sessionNumber;
	/**
	 * @param title
	 * @param duration
	 * @param sessionNumber
	 */
	public Chapter(String title, int duration, int sessionNumber) {
		super();
		this.title = title;
		this.duration = duration;
		this.sessionNumber = sessionNumber;
	}
}
