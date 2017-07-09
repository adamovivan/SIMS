package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Account;
import application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import role.Person;
import state.GuideMainView;
import state.LogIn;
import state.SignUp;
import state.TouristMainView;

public class LogInController implements Initializable{

	public static LogInController instance = null;
	private static double xOffset = 0;
    private static double yOffset = 0;

	public static LogInController getInstance(){
		if(instance == null)
			instance = new LogInController();
		return instance;
	}

	public LogInController() {
	}

	@FXML
	private Label labelStatus;

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	@FXML
	private AnchorPane dragPane;

	public void logIn(ActionEvent event) {

		if(checkLogin())
			loginValid();
		else
			loginFail();
	}

	public boolean checkLogin() {
		String username = this.username.getText();
		String password = this.password.getText();
		
		ArrayList<Account> accounts = (ArrayList<Account>) Application.getInstance().accounts;
		
		if(username.equals("") && password.equals("")){
			Application.getInstance().user = new Account("admin", "admin", "", "/icons/avatar.jpg",
					new Person("", "", "", "", null));
			return true;
		}
			

		for(Account account : accounts){
			if(username.equals(account.getUsername()) && password.equals(account.getPassword())){
				Application.getInstance().user = account;
				return true;
			}
		}
		
		return false;
	}
	
	public void loginFail(){
		labelStatus.setText("Login Failed");
		Application.getInstance().changeState(new LogIn());
	}

	public void loginValid(){
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
		dragPane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = Controller.getInstance().primaryStage.getX() - event.getScreenX();
                yOffset = Controller.getInstance().primaryStage.getY() - event.getScreenY();
            }
        });

		dragPane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	Controller.getInstance().primaryStage.setX(event.getScreenX() + xOffset);
            	Controller.getInstance().primaryStage.setY(event.getScreenY() + yOffset);
            }
        });

	}


}
