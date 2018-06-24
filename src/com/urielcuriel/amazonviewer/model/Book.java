package com.urielcuriel.amazonviewer.model;

import java.util.Date;

public class Book extends Publishing implements IVisualizable{
	private int id;
	private String isbn;
	private boolean read;
	private int timeRead;
	
	
	/**
	 * @param title
	 * @param edititionDate
	 * @param editorial
	 * @param isbn
	 */
	public Book(String title, Date edititionDate, String editorial, String isbn) {
		super(title, edititionDate, editorial);
		this.isbn = isbn;
	}
	
	public int getId() {
		return id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	public int getTimeRead() {
		return timeRead;
	}
	public void setTimeRead(int timeRead) {
		this.timeRead = timeRead;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " :: BOOK :: \n"+super.toString();
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds() - dateI.getSeconds()>0) {
			setTimeRead(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeRead(0);
		}
	}
	
}
