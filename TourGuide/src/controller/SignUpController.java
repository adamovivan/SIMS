package controller;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Account;
import application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import role.Person;
import state.LogIn;
import state.SignUp;

public class SignUpController implements Initializable {

	public static SignUpController instance = null;

	private static double xOffset = 0;
    private static double yOffset = 0;

    private String imageURI;

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

	@FXML
	private AnchorPane signUpDragPane;

	public void register(ActionEvent event){
		if(registration())
			registered();
		else
			signUpFail();
	}

	public boolean registration(){
		imageURI = "/icons/avatar.jpg";
		ArrayList<Account> accounts = (ArrayList<Account>) Application.getInstance().getAccount();
		
		if(firstName.getText().equals("")){
			labelStatus.setText("Field First Name can't be empty"); return false;
		}
		else if(lastName.getText().equals("")){
			labelStatus.setText("Field Last Name can't be empty"); return false;
		}
		else if(umcn.getText().equals("")){
			labelStatus.setText("Field UMCN can't be empty"); return false;
		}
		else if(umcnExists(accounts, umcn.getText())){
			labelStatus.setText("UMCN already exists"); return false;
		}
		else if(username.getText().equals("")){
			labelStatus.setText("Field Username can't be empty"); return false;
		}
		else if(usernameExists(accounts, username.getText())){
			labelStatus.setText("Username already exists"); return false;
		}
		else if(password.getText().equals("")){
			labelStatus.setText("Field Password can't be empty"); return false;
		}
		
		else{
			return true;
		}
	}
	
	public boolean usernameExists(ArrayList<Account> accounts, String username){
			
		for(Account a : accounts){
			if(a.getUsername().equals(username)) {
				return true;
				}
		}
		
		return false;
	}
	
	public boolean umcnExists(ArrayList<Account> accounts,  String umcn){
		
		for(Account a : accounts){
			if(a.getPerson().getUmcn().equals(umcn)) {
				return true;
				}
		}
		
		return false;
	}
	
	public void cancelSignUp(ActionEvent event) {
		Controller.getInstance().setLogInScene();
		Application.getInstance().changeState(new LogIn());
	}

	public void changeUserPicture() {
		FileChooser fc = new FileChooser();
		fc.getExtensionFilters().add(new ExtensionFilter("JPG","*.jpg"));
		fc.getExtensionFilters().add(new ExtensionFilter("PNG","*.png"));
		File selected = fc.showOpenDialog(null);

		if(selected != null){
			imageURI = selected.toURI().toString();
			userPhoto.setImage(new Image(imageURI));
		}
		else{
			System.out.println("File not valid!");
		}

	}

	public void signUpFail(){
		Application.getInstance().changeState(new SignUp());
	}

	public void registered(){
		Account account = new Account(username.getText(), password.getText(), description.getText(), imageURI,
				new Person(firstName.getText(), lastName.getText(), umcn.getText(), address.getText(), null));

		// set user 
		Application.getInstance().setUser(account);
		
		// adding new account
		Application.getInstance().addAccount(account);

		// save account in file
		Application.getInstance().dumpAccounts();

		// change scene
		Controller.getInstance().setMainViewScene();
		
		// set state
		Application.getInstance().changeState(new LogIn());
		
	}

	public void clearUserPass() {
		username.setText("");
		password.setText("");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		userPhoto.setOnMouseClicked((event) -> {changeUserPicture();});

		signUpDragPane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = Controller.getInstance().primaryStage.getX() - event.getScreenX();
                yOffset = Controller.getInstance().primaryStage.getY() - event.getScreenY();
            }
        });

		signUpDragPane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	Controller.getInstance().primaryStage.setX(event.getScreenX() + xOffset);
            	Controller.getInstance().primaryStage.setY(event.getScreenY() + yOffset);
            }
        });
	}

	public TextField getUmcn() {
		return umcn;
	}

	public void setUmcn(String umcn) {
		this.umcn.setText(umcn);
	}

	public TextField getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username.setText(username);
	}


}
