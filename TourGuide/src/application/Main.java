package application;

import controller.Controller;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Controller controller = Controller.getInstance();
		controller.init(primaryStage);
		
		try {
			
			Image applicationIcon = new Image(getClass().getResourceAsStream("/icons/logo.jpg"));
		    primaryStage.getIcons().add(applicationIcon);
			primaryStage.setTitle("MiTe");
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		launch(args);
	}
}
