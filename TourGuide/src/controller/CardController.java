package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import tour.Tour;

public class CardController implements Initializable {

	public CardController() {
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	// add pictures later
	// ADD CITY
	public void setData(Tour t){
		cardLabel.setText(t.tourName);
		cityName.setText("add later...");
		tourType.setText(t.getTourType().getType());
		guideUsername.setText(t.getGuide().getUsername());
	}

}
