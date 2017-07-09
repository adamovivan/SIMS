package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import tour.Tour;

public class ExtendedCardController implements Initializable {

	public static ExtendedCardController instance = null;
	private static double xOffset = 0;
	private static double yOffset = 0;

	public static ExtendedCardController getInstance() {
		if (instance == null)
			instance = new ExtendedCardController();
		return instance;
	}

	public ExtendedCardController() {
	}

	@FXML
	public Label tourNameLabel;

	@FXML
	public Label cityNameLabel;

	@FXML
	public Label tourTypeLabel;

	@FXML
	public Label guideFirstNameLabel;

	@FXML
	public Label guideLastNameLabel;

	@FXML
	public Label guideUsernameLabel;

	@FXML
	public ImageView guidePicture;

	@FXML
	public ImageView userPhotoOverlay;

	@FXML
	public ImageView mainPicture;

	@FXML
	public ImageView galleryPicture1;

	@FXML
	public ImageView galleryPicture2;

	@FXML
	public ImageView galleryPicture3;

	@FXML
	public ImageView galleryPicture4;

	@FXML
	public ImageView galleryPicture5;

	@FXML
	public DatePicker tourDates;

	@FXML
	public TextField availableSpots;

	@FXML
	public TextField totalSpots;

	@FXML
	public TextArea tourInfo;

	@FXML
	public DatePicker bookDates;

	@FXML
	public TextArea comments;

	@FXML
	public ImageView closeWindow;

	@FXML
	public Button bookButton;

	@FXML
	public AnchorPane dragPane;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// make window draggable
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

		closeWindow.setOnMouseClicked((event) -> {
			closeWindow();
		});

	}

	public void closeWindow() {
		// automatically change to correct state (Guide/User)
		Application.getInstance().changeState(Application.getInstance().getUserTypeState());
		Controller.getInstance().setMainViewScene();
	}

	public void disableBookButton() {
		bookButton.setDisable(true);
	}

	public void enableBookButton() {
		bookButton.setDisable(false);
	}

	public void loadTourInfo() {
		Tour t = MainController.getInstance().selectedTour;
		tourNameLabel.setText(t.getTourName());
		// TODO
		cityNameLabel.setText("Novi Sad");
		tourTypeLabel.setText(t.getTourType().getType());
		availableSpots.setText(Integer.toString(t.getAvailableSpots()));
		totalSpots.setText(Integer.toString(t.getMaxSpots()));
		// TODO toString route !!!
		tourInfo.setText(t.getRoute().toString());
		// TODO add attribute firstName to guide
		guideFirstNameLabel.setText("Nikola");
		// TODO add attribute firstName to guide
		guideLastNameLabel.setText("Tomic");
		guideUsernameLabel.setText(t.getGuide().getUsername());

		// TODO set all remaining pictures (after all attributes added)
		// ...

	}
}
