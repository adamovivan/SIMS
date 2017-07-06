package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Singleton
public class Controller {
	
	private static Controller instance = null;
	
	private Stage primaryStage;
	
	private Scene sceneLogIn;
	private Scene sceneMainView;
	private Scene sceneEditProfile;
	private Scene sceneSignUp;
	
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
			sceneLogIn.getStylesheets().add(getClass().getResource("../style/logInStyle.css").toExternalForm());
			
			// sign up scene
			Parent signUpRoot = FXMLLoader.load(getClass().getResource("../view/SignUp.fxml"));
			sceneSignUp = new Scene(signUpRoot);
			sceneSignUp.getStylesheets().add(getClass().getResource("../style/signUpStyle.css").toExternalForm());
			
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
	
	public void setMainViewScene(){
		primaryStage.close();
		primaryStage.setScene(sceneMainView);
		primaryStage.show();
	}
	
	public void setLogInScene(){
		primaryStage.close();
		primaryStage.setScene(sceneLogIn);
		primaryStage.show();
	}
	
	public void setSignUpScene(){
		primaryStage.close();
		primaryStage.setScene(sceneSignUp);
		primaryStage.show();
	}
}






