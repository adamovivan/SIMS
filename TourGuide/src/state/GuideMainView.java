/***********************************************************************
 * Module:  GuideMainView.java
 * Author:  Nikola
 * Purpose: Defines the Class GuideMainView
 ***********************************************************************/

package state;

import controller.MainController;

public class GuideMainView extends State {
	public int doo() {
		// TODO: implement
		return 0;
	}

	public int entry() {
		System.out.println("GuideMain entry");
		MainController.getInstance().enableMyTours();
		return 0;
	}

	public int exit() {
		System.out.println("GuideMain exit");
		return 0;
	}

}