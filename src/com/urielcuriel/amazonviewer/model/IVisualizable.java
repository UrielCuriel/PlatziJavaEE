package com.urielcuriel.amazonviewer.model;

import java.util.Date;

/**
 * @author Uriel Curiel
 *
 */
public interface IVisualizable {
	Date startToSee(Date dateI);
	void stopToSee(Date dateI,Date dateF);
}
