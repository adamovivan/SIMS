package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class MainViewController {

	public MainViewController(){
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

}
