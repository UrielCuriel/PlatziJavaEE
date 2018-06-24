package com.urielcuriel.amazonviewer.model;

import java.util.Date;

public class Book {
	private int id;
	private String title;
	private Date edititionDate;
	private String editorial;
	private String[] authors;
	private String isbn;
	private boolean read;
	private int timeRead;
	/**
	 * @param title
	 * @param edititionDate
	 * @param editorial
	 */
	public Book(String title, Date edititionDate, String editorial) {
		super();
		this.title = title;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
	}
}
