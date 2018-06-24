package com.urielcuriel.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publishing{
	
	private int id;

	/**
	 * @param title
	 * @param edititionDate
	 * @param editorial
	 */
	public Magazine(String title, Date edititionDate, String editorial) {
		super(title, edititionDate, editorial);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " :: MAGAZINE :: \n"+super.toString();
	}

	
	
	
}
