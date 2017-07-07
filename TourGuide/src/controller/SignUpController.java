package controller;

import application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import state.LogIn;

public class SignUpController {

	public SignUpController() {
	}

	@FXML
	public Label labelStatus;

	@FXML
	private TextField firstNameText;

	@FXML
	private TextField lastNameText;

	@FXML
	private TextField umcnText;

	@FXML
	private TextField addressText;

	@FXML
	private TextField usernameText;

	@FXML
	private TextField passwordText;

	@FXML
	private TextArea descriptionField;

	public void register(ActionEvent event){
		System.out.println("Register called!");
		if(firstNameText.getText().equals("")){
			labelStatus.setText("Field First Name can't be empty");
		}

	}

	public void cancelSignUp(ActionEvent event) {
		Controller.getInstance().setLogInScene();
		Application.getInstance().changeState(new LogIn());
	}

	public void changeUserPicture(ActionEvent event) {
		System.out.println("Change user picture!");
	}
}
