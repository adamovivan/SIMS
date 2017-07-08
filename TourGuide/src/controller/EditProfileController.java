package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class EditProfileController implements Initializable {

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

}
