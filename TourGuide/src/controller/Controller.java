package controller;

import application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import state.LogIn;

// Singleton
public class Controller {

	private static Controller instance = null;

	public Stage primaryStage;
	public Stage extendedCardStage;

	public Scene sceneLogIn;
	public Scene sceneMainView;
	public Scene sceneEditProfile;
	public Scene sceneSignUp;
	public Scene sceneExtendedCard;

	private Controller() {
	}

	public static Controller getInstance() {
		if (instance == null) {
			instance = new Controller();
		}
		return instance;
	}

	public void init(Stage stage) {

		primaryStage = stage;
		primaryStage.initStyle(StageStyle.UNDECORATED);

		try {

			// log in scene
			LogInController loginCtrl = LogInController.getInstance();
			FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("../view/LogIn.fxml"));
			loginLoader.setController(loginCtrl);
			Parent logInRoot = loginLoader.load();
			sceneLogIn = new Scene(logInRoot);
			sceneLogIn.getStylesheets().add(getClass().getResource("../style/logInStyle.css").toExternalForm());

			// sign up scene
			SignUpController signUpCtrl = SignUpController.getInstance();
			FXMLLoader signupLoader = new FXMLLoader(getClass().getResource("../view/SignUp.fxml"));
			signupLoader.setController(signUpCtrl);
			Parent signUpRoot = signupLoader.load();
			sceneSignUp = new Scene(signUpRoot);
			sceneSignUp.getStylesheets().add(getClass().getResource("../style/signUpStyle.css").toExternalForm());

			// main view scene
			MainController mainCtrl = MainController.getInstance();
			FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("../view/MainView.fxml"));
			mainLoader.setController(mainCtrl);
			Parent mainViewRoot = mainLoader.load();
			sceneMainView = new Scene(mainViewRoot);

			// edit profile scene
			EditProfileController editProfileCtrl = EditProfileController.getInstance();
			FXMLLoader editProfileLoader = new FXMLLoader(getClass().getResource("../view/EditProfile.fxml"));
			editProfileLoader.setController(editProfileCtrl);
			Parent editProfileRoot = editProfileLoader.load();
			sceneEditProfile = new Scene(editProfileRoot);

			// edit profile scene
			ExtendedCardController extendedCardController = ExtendedCardController.getInstance();
			FXMLLoader extendedCardLoader = new FXMLLoader(getClass().getResource("../view/ExtendedCardView.fxml"));
			extendedCardLoader.setController(extendedCardController);
			Parent extendedCardRoot = extendedCardLoader.load();
			sceneExtendedCard = new Scene(extendedCardRoot);

			// first scene set
			primaryStage.setScene(sceneLogIn);
			// initial state
			Application.getInstance().setState(new LogIn());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setMainViewScene() {
		primaryStage.close();
		primaryStage.setScene(sceneMainView);
		primaryStage.show();
	}

	public void setLogInScene() {
		primaryStage.close();
		primaryStage.setScene(sceneLogIn);
		primaryStage.show();
	}

	public void setSignUpScene() {
		primaryStage.close();
		primaryStage.setScene(sceneSignUp);
		primaryStage.show();
	}

	public void setEditProfileScene() {
		primaryStage.close();
		primaryStage.setScene(sceneEditProfile);
		primaryStage.show();
	}

	public void setExtendedCardScene() {
		/*
		primaryStage.setScene(sceneExtendedCard);
		extendedCardStage.initModality(Modality.APPLICATION_MODAL);
		extendedCardStage.initOwner(MainController.getInstance().vbox.getScene().getWindow());
		extendedCardStage.showAndWait();
		*/
		//primaryStage.close();
		primaryStage.setScene(sceneExtendedCard);
		primaryStage.show();
	}
}
