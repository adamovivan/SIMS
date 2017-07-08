package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Account;
import application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import state.EditProfile;

public class MainController implements Initializable{

	public static MainController instance = null;

	public static MainController getInstance(){
		if(instance == null)
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

	ObservableList<String> searchForList = FXCollections.observableArrayList("City","Place","Tour","Guide");
	ObservableList<String> sortByList = FXCollections.observableArrayList("Most Popular","Newest","Oldest");
	SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99, 1);
	ObservableList<String> typesList = FXCollections.observableArrayList("All","Biking","Hiking","Walking");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//init searchForCombo
		searchForCombo.setOnAction((event) -> {searchForChanged();});
		searchForCombo.setItems(searchForList);
		searchForCombo.setValue("City");

		//init sort by combo
		sortByCombo.setOnAction((event) ->{sortByChanged();});
		sortByCombo.setItems(sortByList);
		sortByCombo.setValue("Most Popular");

		//init spinner
		valueFactory.setValue(1);
		spotsSpinner.setValueFactory(valueFactory);

		//init types
		typeCombo.setItems(typesList);
		typeCombo.setValue("All");

		//dates
		startDatePicker.onActionProperty();
		System.out.print("Date picker:");
		System.out.println(startDatePicker.getValue());

		// user image click -> edit profile window
		userImageOverlay.setOnMouseClicked((event) -> {editUserProfileClicked();});

	}

	public void searchForChanged(){
		System.out.println(searchForCombo.getValue());
	}

	public void sortByChanged(){
		System.out.println(sortByCombo.getValue());
	}

	public void editUserProfileClicked(){
		Controller.getInstance().setEditProfileScene();
		Application.getInstance().changeState(new EditProfile());
	}

	public void setProfile(){
		Account user = Application.getInstance().user;
		
		firstNameLabel.setText(user.getPerson().getFirstName());
		lastNameLabel.setText(user.getPerson().getLastName());
		userName.setText(user.getUsername());
		//mainCtrl.descriptionPanel.setText(user.getDescription());  // TODO label maybe instead of description panel?? 
		userPhoto.setImage(new Image(user.getPicture()));
		
	}
}
