package application;

import controller.Controller;
import data.TestData;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import tour.City;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		application.Application app = application.Application.getInstance();
		Controller controller = Controller.getInstance();

		controller.init(primaryStage);
		//TestData t = new TestData();
		//t.dumpData();

		try {
			Image applicationIcon = new Image(getClass().getResourceAsStream("/icons/logo.png"));
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
