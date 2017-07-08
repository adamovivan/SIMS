package controller;

import java.io.File;

import application.Account;
import application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import role.Person;
import state.LogIn;
import state.SignUp;

public class SignUpController {

	public static SignUpController instance = null;

	public static SignUpController getInstance(){
		if(instance == null)
			instance = new SignUpController();
		return instance;
	}

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

	@FXML
	private Button registerButton;

	public void register(ActionEvent event){
		if(registration())
			registered();
		else
			signUpFail();
	}

	public boolean registration(){
		if(firstName.getText().equals("")){
			labelStatus.setText("Field First Name can't be empty"); return false;
		}
		else if(lastName.getText().equals("")){
			labelStatus.setText("Field Last Name can't be empty"); return false;
		}
		else if(umcn.getText().equals("")){
			labelStatus.setText("Field UMCN can't be empty"); return false;
		}
		else if(username.getText().equals("")){
			labelStatus.setText("Field Username can't be empty"); return false;
		}
		else if(password.getText().equals("")){
			labelStatus.setText("Field Password can't be empty"); return false;
		}
		else{
			return true;
		}
	}

	public void cancelSignUp(ActionEvent event) {
		Controller.getInstance().setLogInScene();
		Application.getInstance().changeState(new LogIn());
	}

	public void changeUserPicture(ActionEvent event) {
		FileChooser fc = new FileChooser();
		File selected = fc.showOpenDialog(null);
		if(selected != null)
			userPhoto.setImage(new Image(selected.getAbsolutePath()));
		else
			System.out.println("File not valid!");
	}

	public void signUpFail(){
		Application.getInstance().changeState(new SignUp());
	}

	public void registered(){
		Account account = new Account(username.getText(), password.getText(), description.getText(), "IMAGE",
				new Person(firstName.getText(), lastName.getText(), umcn.getText(), address.getText(), null));

		// adding new account
		Application.getInstance().accounts.add(account);

		// save account in file
		Application.getInstance().dumpAccounts();

		// change scene
		Controller.getInstance().setMainViewScene();
		Application.getInstance().changeState(new LogIn());
	}

	public void clearUserPass() {
		username.setText("");
		password.setText("");
	}


}
