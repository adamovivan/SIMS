package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SignUpController {
	@FXML
	public Label labelStatus;
	
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
		
	}
	
	public void cancel(ActionEvent event) {
		Controller.getInstance().setLogInScene();
	}
	
}
