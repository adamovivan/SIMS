/***********************************************************************
 * Module:  ExtendedCardView.java
 * Author:  Nikola
 * Purpose: Defines the Class ExtendedCardView
 ***********************************************************************/

package state;

import controller.ExtendedCardController;

public class ExtendedCard extends State {
	public int doo() {
		// TODO: implement
		return 0;
	}

	public int entry() {
		// load info
		ExtendedCardController.getInstance().loadTourInfo();

		// disable book button
		ExtendedCardController.getInstance().disableBookButton();

		return 0;
	}

	public int exit() {
		System.out.println("Extended card view exit!");
		return 0;
	}
}