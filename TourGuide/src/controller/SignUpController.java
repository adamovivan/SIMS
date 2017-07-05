package controller;

import javafx.event.ActionEvent;

public class SignUpController {
	
	public void cancel(ActionEvent event) {
		Controller.getInstance().setLogInScene();
	}
}
