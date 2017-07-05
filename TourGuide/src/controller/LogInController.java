package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LogInController {
	@FXML
	private Label labelStatus;

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	public void logIn(ActionEvent event) {
		
		if(username.getText().equals("admin") && password.getText().equals("admin")) {
			labelStatus.setText("Login Success");
			Controller.getInstance().changeLogInScene();
			
		} else {
			labelStatus.setText("Login Failed");
		}
	}
	
	public void cancel(ActionEvent event) {
		System.exit(0);
	}
}
