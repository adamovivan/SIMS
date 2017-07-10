package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Account;
import application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class EditProfileController implements Initializable {
	
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
	private TextField oldPassword;
	
	@FXML
	private TextField newPassword1;
	
	@FXML
	private TextField newPassword2;

	@FXML
	private TextArea description;

	public static EditProfileController instance = null;

	public static EditProfileController getInstance(){
		if(instance == null)
			instance = new EditProfileController();
		return instance;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	//TODO CHANGE STATE
	public void cancel(ActionEvent event){
		Controller.getInstance().setMainViewScene();

	}
	
	public void setProfile(){
		Account user = Application.getInstance().user;

		firstName.setText(user.getPerson().getFirstName());
		lastName.setText(user.getPerson().getLastName());
		
		umcn.setText(user.getPerson().getUmcn());
		username.setText(user.getUsername());
		
		address.setText(user.getPerson().getAddress());
		description.setText(user.getDescription()); 
		
		userPhoto.setImage(new Image(user.getPicture()));

	}
	
}
