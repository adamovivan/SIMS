package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LogInController {
	@FXML
	private Label labelStatus;

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	public void logIn(ActionEvent event) {
		
		if(username.getText().equals("") && password.getText().equals("")) {
			labelStatus.setText("Login Success");
			Controller.getInstance().setMainViewScene();
			
		} else {
			labelStatus.setText("Login Failed");
		}
	}
	
	public void cancel(ActionEvent event) {
		System.exit(0);
	}
	
	public void SignUp(ActionEvent event) throws IOException {
		Controller.getInstance().setSignUpScene();
//		Parent root = FXMLLoader.load(getClass().getResource("../view/SignUp.fxml"));
//		Scene scene = new Scene(root);
//		Stage stage = new Stage();
//		scene.getStylesheets().add(getClass().getResource("signUpStyle.css").toExternalForm());
//		Image applicationIcon = new Image(getClass().getResourceAsStream("/icons/logo.jpg"));
//		stage.getIcons().add(applicationIcon);
//		stage.setScene(scene);
//		stage.setTitle("MiTe");
//		stage.show();
	}
}
