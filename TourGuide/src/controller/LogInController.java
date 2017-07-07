package controller;

import application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import state.LogIn;
import state.SignUp;

public class LogInController {

	public LogInController() {
	}

	@FXML
	private Label labelStatus;

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	public void logIn(ActionEvent event) {

		if(Application.getInstance().checkLogin(username.getText(), password.getText())) {

			labelStatus.setText("Login Success");
			Controller.getInstance().setMainViewScene();

		} else {
			loginFail();
		}
	}
	public void loginFail(){
		labelStatus.setText("Login Failed");
		Application.getInstance().changeState(new LogIn());
	}

	public void loginCanceled(ActionEvent event) {
		System.exit(0);
	}

	public void signUpClicked(ActionEvent event){
		Controller.getInstance().setSignUpScene();
		Application.getInstance().changeState(new SignUp());

	}
}
