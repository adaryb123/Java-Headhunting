package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerSceneAddFreelancer {

    @FXML
    private TextField TextFieldPreferredPlatform;

    @FXML
    private Spinner<?> SpinnerYearsOfExperience;

    @FXML
    private Spinner<?> SpinnerDailyWage;

    @FXML
    private RadioButton RadioButtonProgrammer;

    @FXML
    private RadioButton RadioButtonAdministrator;

    @FXML
    private RadioButton RadioButtonConsultant;

    @FXML
    private RadioButton RadioButtonYes;

    @FXML
    private RadioButton RadioButtonNo;

    @FXML
    private TextField TextFieldFullName;

    @FXML
    private TextField TextFieldCertificate;

    @FXML
    private Button ButtonAdd;

    @FXML
    private TextArea TextAreaCertificates;

    @FXML
    private Button ButtonSubmit;

    @FXML
    private ComboBox<?> ComboBoxEducation;

    @FXML
    private ComboBox<?> ComboBoxLanguage;

    @FXML
    private ComboBox<?> ComboBoxSpecialization;

    @FXML
    void ButtonAddOnAction(ActionEvent event) {

    }

    @FXML
    void ButtonSubmitOnAction(ActionEvent event) {

    }

}
