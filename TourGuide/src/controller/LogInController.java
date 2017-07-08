package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import state.GuideMainView;
import state.LogIn;
import state.SignUp;
import state.TouristMainView;

public class LogInController implements Initializable{

	public LogInController() {
	}

	@FXML
	private Label labelStatus;

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	public void logIn(ActionEvent event) {

		if(Application.getInstance().checkLogin(username.getText(), password.getText()))
			loginValid();
		else
			loginFail();
	}

	public void loginFail(){
		labelStatus.setText("Login Failed");
		Application.getInstance().changeState(new LogIn());
	}

	public void loginValid(){
		labelStatus.setText("Login Success");			// hard to see actually xD
		Controller.getInstance().setMainViewScene();
		// if user is Guide (set conditions)
		if(true){
			Application.getInstance().changeState(new GuideMainView());
		}
		else{
			Application.getInstance().changeState(new TouristMainView());
		}
	}

	public void loginCanceled(ActionEvent event) {
		System.exit(0);
	}

	public void signUpClicked(ActionEvent event){
		Controller.getInstance().setSignUpScene();
		Application.getInstance().changeState(new SignUp());

	}

	public void someAction(ActionEvent event){
		System.out.println("Some event!");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}


}
