package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private Label LabelStatus;

	@FXML
	private TextField userName;

	@FXML
	private TextField password;

	public void LogIn(ActionEvent event) {
		if(userName.getText().equals("user") && password.getText().equals("pass")) {
			LabelStatus.setText("Login Success");
		} else {
			LabelStatus.setText("Login Failed");
		}
	}

	public void Cancel(ActionEvent event) {
		System.exit(0);
	}
}