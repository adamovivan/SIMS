package controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Singleton
public class Controller {
	
	private static Controller instance = new Controller();
	
	private Stage primaryStage;
	
	private Scene sceneCurrent;
	private Scene sceneLogIn;
	private Scene sceneMainView;
	private Scene sceneEditProfile;
	
	private Controller(){}
	
	public static Controller getInstance() {
	      if(instance == null) {
	         instance = new Controller();
	      }
	      return instance;
    }
	
	public void init(Stage stage){
		
		primaryStage = stage;
		
		try {
			
			// log in scene
			Parent logInRoot = FXMLLoader.load(getClass().getResource("../view/LogIn.fxml"));
			sceneLogIn = new Scene(logInRoot);
			sceneLogIn.getStylesheets().add(getClass().getResource("../view/logIn.css").toExternalForm());

			// main view scene
			Parent mainViewRoot = FXMLLoader.load(getClass().getResource("../view/MainView.fxml"));
			sceneMainView = new Scene(mainViewRoot);
			
			// edit profile scene
			Parent editProfileRoot = FXMLLoader.load(getClass().getResource("../view/EditProfile.fxml"));
			sceneEditProfile = new Scene(editProfileRoot);
			
			// first scene set
			primaryStage.setScene(sceneLogIn);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeLogInScene(){
		primaryStage.close();
		primaryStage.setScene(sceneMainView);
		primaryStage.show();

	}
}






