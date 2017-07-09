package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import state.ExtendedCard;
import tour.Tour;

public class CardController implements Initializable {

	public Tour thisTour;

	public CardController() {
		thisTour = null;
	}

	@FXML
	private Label cardLabel;

	@FXML
	private Label cityName;

	@FXML
	private Label tourType;

	@FXML
	private Label freeSpots;

	@FXML
	private Label guideUsername;

	@FXML
	private ImageView cardImage;

	@FXML
	private ImageView guidePhoto;

	@FXML
	private AnchorPane cardBackground;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cardBackground.setOnMouseClicked((event) -> {cardClicked();});
	}

	// TODO
	private void cardClicked() {
		// because we don't know which card is clicked (multiple controllers)
		MainController.getInstance().selectedTour = thisTour;
		Controller.getInstance().setExtendedCardScene();
		Application.getInstance().changeState(new ExtendedCard());
	}

	// add pictures
	// ADD cityName attribute
	// LOAD GUIDE IMAGE
	public void setData(Tour tour) {
		thisTour = tour;
		cardLabel.setText(tour.tourName);
		cityName.setText("Novi Sad");
		// cardImage.setImage(new Image("C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//novisad.jpg"));
		freeSpots.setText(Integer.toString(tour.getAvailableSpots()));
		tourType.setText(tour.getTourType().getType());
		guideUsername.setText(tour.getGuide().getUsername());
		// guidePhoto.setImage(new Image("C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg"));
	}

}
