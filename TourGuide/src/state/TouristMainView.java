/***********************************************************************
 * Module:  TouristMainView.java
 * Author:  Nikola
 * Purpose: Defines the Class TouristMainView
 ***********************************************************************/

package state;

import application.Main;
import controller.MainController;

public class TouristMainView extends State {
	public int doo() {
		// TODO: implement
		return 0;
	}

	public int entry() {
		System.out.println("TouristMain entry");
		MainController.getInstance().disableMyTours();
		return 0;
	}

	public int exit() {
		System.out.println("TouristMain exit");
		return 0;
	}
}