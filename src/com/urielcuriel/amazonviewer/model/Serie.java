package com.urielcuriel.amazonviewer.model;

public class Serie extends Film {

	private int id;
	private int seasionQuantity;
	private Chapter[] chapters; 
	/**
	 * @param title
	 * @param genre
	 * @param creator
	 * @param duration
	 */
	public Serie(String title, String genre, String creator, int duration,int seasonQuantity) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.seasionQuantity= seasonQuantity;
	}
	public int getId() {
		return id;
	}
	public Chapter[] getChapters() {
		return chapters;
	}
	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}
	
	public int getSeasionQuantity() {
		return seasionQuantity;
	}
	public void setSeasionQuantity(int seasionQuantity) {
		this.seasionQuantity = seasionQuantity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: SERIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}
	
}
