package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.*;
import model.Administrator;
import model.Consultant;
import model.Freelancer;
import model.Programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ControllerSceneAddFreelancer {
    @FXML
    private Group GroupAdministrator;

    @FXML
    private TextField TextFieldPreferredPlatform;

    @FXML
    private ComboBox<String> ComboBoxSpecialization;

    @FXML
    private Spinner<Integer> SpinnerYearsOfExperience;

    @FXML
    private Spinner<Integer> SpinnerDailyWage;

    @FXML
    private RadioButton RadioButtonProgrammer;

    @FXML
    private ToggleGroup ToggleGroup3Buttons;

    @FXML
    private RadioButton RadioButtonAdministrator;

    @FXML
    private RadioButton RadioButtonConsultant;

    @FXML
    private Group GroupConsultant;

    @FXML
    private RadioButton RadioButtonYes;

    @FXML
    private ToggleGroup ToggleGroup2Buttons;

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
    private Group GroupProgrammer;

    @FXML
    private ComboBox<String> ComboBoxLanguage;

    @FXML
    void ButtonAddOnAction(ActionEvent event) {
        if (!(TextFieldCertificate.getText().isEmpty())){
            TextAreaCertificates.appendText(TextFieldCertificate.getText() + "\n");
            TextFieldCertificate.setText("");
        }
    }

    @FXML
    void ButtonSubmitOnAction(ActionEvent event) {
        if (TextFieldFullName.getText().isEmpty() || ComboBoxEducation.getSelectionModel().isEmpty()){
            new Alert(Alert.AlertType.ERROR,"Fill in all information first",ButtonType.OK).showAndWait();
        }
        else{
            ArrayList<String> certificates = new ArrayList<>(Arrays.asList(TextAreaCertificates.getText().split("\n")));

            if (RadioButtonProgrammer.isSelected()){
                if (ComboBoxLanguage.getSelectionModel().isEmpty()) {
                    new Alert(Alert.AlertType.ERROR,"Fill in all information",ButtonType.OK).showAndWait();
                }
                else{
                    Programmer programmer = new Programmer(TextFieldFullName.getText(),
                            SpinnerDailyWage.getValue(),SpinnerYearsOfExperience.getValue(),
                            Freelancer.Education.valueOf(ComboBoxEducation.getValue()),certificates,
                            Programmer.Language.valueOf(ComboBoxLanguage.getValue()));

                    ArrayList<Freelancer> freelancers = DataStorage.getFreelancers();
                    freelancers.add(programmer);
                    DataStorage.setFreelancers(freelancers);
                    WindowReference.getParentController().switchToMain();
                }
            }
            else if (RadioButtonConsultant.isSelected()){
                Consultant consultant = new Consultant(TextFieldFullName.getText(),
                        SpinnerDailyWage.getValue(),SpinnerYearsOfExperience.getValue(),
                        Freelancer.Education.valueOf(ComboBoxEducation.getValue()),certificates,
                        RadioButtonYes.isSelected());

                ArrayList<Freelancer> freelancers = DataStorage.getFreelancers();
                freelancers.add(consultant);
                DataStorage.setFreelancers(freelancers);
                WindowReference.getParentController().switchToMain();
            }
            else if (RadioButtonAdministrator.isSelected()){
                if (ComboBoxSpecialization.getSelectionModel().isEmpty() || TextFieldPreferredPlatform.getText().isEmpty()){
                    new Alert(Alert.AlertType.ERROR,"Fill in all information",ButtonType.OK).showAndWait();
                }
                else{
                    Administrator administrator = new Administrator(TextFieldFullName.getText(),
                            SpinnerDailyWage.getValue(),SpinnerYearsOfExperience.getValue(),
                            Freelancer.Education.valueOf(ComboBoxEducation.getValue()),certificates,
                            Administrator.Specialization.valueOf(ComboBoxSpecialization.getValue()),
                            TextFieldPreferredPlatform.getText());

                    ArrayList<Freelancer> freelancers = DataStorage.getFreelancers();
                    freelancers.add(administrator);
                    DataStorage.setFreelancers(freelancers);
                    WindowReference.getParentController().switchToMain();
                }
            }
        }

    }

    @FXML
    void RadioButtonAdministratorOnAction(ActionEvent event) {
        GroupAdministrator.setDisable(false);
        GroupConsultant.setDisable(true);
        GroupProgrammer.setDisable(true);
    }

    @FXML
    void RadioButtonConsultantOnAction(ActionEvent event) {
        GroupAdministrator.setDisable(true);
        GroupConsultant.setDisable(false);
        GroupProgrammer.setDisable(true);
    }

    @FXML
    void RadioButtonProgrammerOnAction(ActionEvent event) {
        GroupAdministrator.setDisable(true);
        GroupConsultant.setDisable(true);
        GroupProgrammer.setDisable(false);
    }

    public void init(){
        List<String> eduValues = Stream.of(Freelancer.Education.values()).map(Freelancer.Education::name).collect(Collectors.toList());
        ComboBoxEducation.getItems().addAll(eduValues);

        List<String> languageValues = Stream.of(Programmer.Language.values()).map(Programmer.Language::name).collect(Collectors.toList());
        ComboBoxLanguage.getItems().addAll(languageValues);

        List<String> specValues = Stream.of(Administrator.Specialization.values()).map(Administrator.Specialization::name).collect(Collectors.toList());
        ComboBoxSpecialization.getItems().addAll(specValues);

        SpinnerValueFactory<Integer> possibleValues = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1);
        SpinnerYearsOfExperience.setValueFactory(possibleValues);

        SpinnerValueFactory<Integer> possibleValues2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,1000,20);
        SpinnerDailyWage.setValueFactory(possibleValues2);

    }
}
