package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

import application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import state.EditProfile;
import tour.Tour;

class MostPopularComparator implements Comparator<Tour> {
	@Override
	public int compare(Tour a, Tour b) {
		return a.getUpVotes() < b.getUpVotes() ? -1 : a.getUpVotes() == b.getUpVotes() ? 0 : 1;
	}
}

public class MainController implements Initializable {

	public static MainController instance = null;
	public boolean reversedByOldest = false;
	private static double xOffset = 0;
	private static double yOffset = 0;

	public ArrayList<Tour> currentlyShown = new ArrayList<Tour>();
	public Tour selectedTour = null;

	public static MainController getInstance() {
		if (instance == null)
			instance = new MainController();
		return instance;
	}

	public MainController() {
	}

	@FXML
	public TextField searchField;

	@FXML
	public ComboBox<String> searchForCombo;

	@FXML
	public ImageView searchImage;

	@FXML
	public ImageView userPhoto;

	@FXML
	public ComboBox<String> sortByCombo;

	@FXML
	public DatePicker startDatePicker;

	@FXML
	public DatePicker endDatePicker;

	@FXML
	public Spinner<Integer> spotsSpinner;

	@FXML
	public ComboBox<String> typeCombo;

	@FXML
	public Button filterButton;

	@FXML
	public VBox vbox;

	@FXML
	public Label userName;

	@FXML
	public Label firstNameLabel;

	@FXML
	public Label lastNameLabel;

	@FXML
	public TextArea descriptionPanel;

	@FXML
	public ImageView userImageOverlay;

	@FXML
	public ImageView closeWindow;

	@FXML
	public AnchorPane dragPane;

	ObservableList<String> searchForList = FXCollections.observableArrayList("City", "Place", "Tour", "Guide");
	ObservableList<String> sortByList = FXCollections.observableArrayList("Most Popular", "Newest", "Oldest");
	SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99, 1);
	ObservableList<String> typesList = FXCollections.observableArrayList("All", "Biking", "Hiking", "Walking");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// init searchForCombo
		searchForCombo.setOnAction((event) -> {
			searchForChanged();
		});
		searchForCombo.setItems(searchForList);
		searchForCombo.setValue("City");

		// init sort by combo
		sortByCombo.setOnAction((event) -> {
			sortByChanged();
		});
		sortByCombo.setItems(sortByList);
		sortByCombo.setValue("Most Popular");

		// init spinner
		valueFactory.setValue(1);
		spotsSpinner.setValueFactory(valueFactory);

		// init types
		typeCombo.setItems(typesList);
		typeCombo.setValue("All");

		// dates
		startDatePicker.onActionProperty();

		// user image click -> edit profile window
		userImageOverlay.setOnMouseClicked((event) -> {
			editUserProfileClicked();
		});

		// close window button
		closeWindow.setOnMouseClicked((event) -> {
			System.exit(0);
		});

		// initialize most popular destinations
		displayCards(Application.getInstance().tours);
		currentlyShown.addAll(Application.getInstance().tours);

		// connect search
		searchImage.setOnMouseClicked((event) -> {
			search();
		});

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

	}

	public void displayCards(Collection<Tour> tours) {
		vbox.getChildren().clear();
		for (Tour t : tours) {
			CardController cardCtrl = new CardController();
			FXMLLoader cardLoader = new FXMLLoader(getClass().getResource("../view/card.fxml"));
			cardLoader.setController(cardCtrl);
			Parent cardRoot = null;
			try {
				cardRoot = cardLoader.load();
			} catch (IOException e) {
				e.printStackTrace();
			}
			cardCtrl.setData(t);
			vbox.getChildren().add(cardRoot);
		}
	}

	// search + sort by
	public void search() {
		// clear previous search
		vbox.getChildren().clear();

		if (searchField.getText().equals(""))
			emptyField();
		// searh
		switch (searchForCombo.getValue()) {
		case "City":
			searchForCity(searchField.getText());
			break;
		case "Place":
			System.out.println("Not implemented!");
			break;
		case "Tour":
			searchByTourName(searchField.getText());
			break;
		case "Guide":
			searchForGuide(searchField.getText());
			break;
		default:
			System.out.println("Wrong combo selection!");
			break;
		}

		// if no search results
		if (currentlyShown.size() == 0)
			emptyField();

		// sort by
		sortBy();

		// display search results
		displayCards(currentlyShown);
	}

	// TODO add noResultLabel to vbox
	private void emptyField() {
		System.out.println("Search field empty!");
	}

	private void sortBy() {
		// TODO Auto-generated method stub
		switch (sortByCombo.getValue()) {
		case "Most Popular":
			sortByMostPopular();
			break;
		case "Newest":
			sortByNewest();
			break;
		case "Oldest":
			sortByOldest();
			break;
		default:
			System.out.println("Wrong combo selection!");
			break;
		}
		displayCards(currentlyShown);
	}

	private void sortByOldest() {
		Collections.reverse(currentlyShown);
		reversedByOldest = true;
	}

	private void sortByNewest() {
		if (reversedByOldest)
			Collections.reverse(currentlyShown);
		reversedByOldest = false;
	}

	private void sortByMostPopular() {
		Collections.sort(currentlyShown, new MostPopularComparator());
	}

	private void searchForGuide(String text) {
		for (Tour t : Application.getInstance().tours) {
			if (t.getGuide().getUsername().toLowerCase().contains(text.toLowerCase())) {
				currentlyShown.add(t);
			}
		}
	}

	private void searchByTourName(String text) {
		for (Tour t : Application.getInstance().tours) {
			if (t.getTourName().toLowerCase().contains(text.toLowerCase())) {
				currentlyShown.add(t);
			}
		}

	}

	// waiting to add attribute
	private void searchForCity(String text) {
		// TODO Auto-generated method stub

	}

	public void searchForChanged() {
		System.out.println(searchForCombo.getValue());
	}

	public void sortByChanged() {
		sortBy();
	}

	public void editUserProfileClicked() {
		Controller.getInstance().setEditProfileScene();
		Application.getInstance().changeState(new EditProfile());
	}

	public void disableBookButton(){

	}

}
