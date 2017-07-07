package controller;

import application.Account;
import application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import role.Person;
import state.LogIn;

public class SignUpController {

	public SignUpController() {
	}

	@FXML
	private Label labelStatus;

	@FXML
	private ImageView userPhoto;
	
	@FXML
	private TextField firstName;

	@FXML
	private TextField lastName;

	@FXML
	private TextField umcn;

	@FXML
	private TextField address;

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	@FXML
	private TextArea description;

	public void register(ActionEvent event){
		if(firstName.getText().equals("")){
			labelStatus.setText("Field First Name can't be empty");
		}
		else if(lastName.getText().equals("")){
			labelStatus.setText("Field Last Name can't be empty");
		}
		else if(umcn.getText().equals("")){
			labelStatus.setText("Field UMCN can't be empty");
		}
		else if(username.getText().equals("")){
			labelStatus.setText("Field Username can't be empty");
		}
		else if(password.getText().equals("")){
			labelStatus.setText("Field Password can't be empty");
		}			
		else{
			Account account = new Account(username.getText(), password.getText(), description.getText(), "IMAGE",
					new Person(firstName.getText(), lastName.getText(), umcn.getText(), address.getText(), null));
			
			// adding new account
			Application.getInstance().account.add(account);
			
			// save account in file
			Application.getInstance().dumpAccounts();
			
			// change scene
			Controller.getInstance().setMainViewScene();
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
