package com.urielcuriel.amazonviewer.model;

import java.util.Date;

public class Movie extends Film implements IVisualizable{
	private int id;
	private int timeViewed;
	
	/**
	 * @param title
	 * @param genre
	 * @param creator
	 * @param duration
	 */
	public Movie(String title, String genre, String creator, int duration,short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getTimeViewed() {
		return timeViewed;
	}
	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: MOVIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
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
			setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeViewed(0);
		}
		
	}
	
	
}
