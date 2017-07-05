package application;

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

	public void SignUp(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("../view/SignUp.fxml"));
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		scene.getStylesheets().add(getClass().getResource("signUpStyle.css").toExternalForm());
		Image applicationIcon = new Image(getClass().getResourceAsStream("/icons/logo.jpg"));
		stage.getIcons().add(applicationIcon);
		stage.setScene(scene);
		stage.setTitle("MiTe");
		stage.show();
	}
}