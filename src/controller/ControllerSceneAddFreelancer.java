package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Consultant;
import model.Freelancer;
import model.Programmer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ControllerSceneAddFreelancer {

    @FXML
    private TextField TextFieldPreferredPlatform;

    @FXML
    private Spinner<Integer> SpinnerYearsOfExperience;

    @FXML
    private Spinner<Integer> SpinnerDailyWage;

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
    private ComboBox<String> ComboBoxEducation;

    @FXML
    private ComboBox<String> ComboBoxLanguage;

    @FXML
    private ComboBox<String> ComboBoxSpecialization;


    public void init(){
        List<String> eduValues = Stream.of(Freelancer.Education.values()).map(Freelancer.Education::name).collect(Collectors.toList());
        ComboBoxEducation.getItems().addAll(eduValues);

        List<String> languageValues = Stream.of(Programmer.Language.values()).map(Programmer.Language::name).collect(Collectors.toList());
        ComboBoxLanguage.getItems().addAll(languageValues);

        List<String> specValues = Stream.of(Consultant.Specialization.values()).map(Consultant.Specialization::name).collect(Collectors.toList());
        ComboBoxSpecialization.getItems().addAll(specValues);

        SpinnerValueFactory<Integer> possibleValues = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1);
        SpinnerYearsOfExperience.setValueFactory(possibleValues);

        SpinnerValueFactory<Integer> possibleValues2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,1000,20);
        SpinnerDailyWage.setValueFactory(possibleValues2);
    }



    @FXML
    void ButtonAddOnAction(ActionEvent event) {

    }

    @FXML
    void ButtonSubmitOnAction(ActionEvent event) {

    }

}
