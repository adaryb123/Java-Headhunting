package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Company;
import model.JobOffer;

import java.util.ArrayList;

public class ControllerSceneAddJobOffer {

    @FXML
    private TextField TextFieldJobTitle;

    @FXML
    private TextArea TextAreaInfo;

    @FXML
    private Button ButtonSubmit;

    @FXML
    private ComboBox<String> ComboBoxCompany;

    @FXML
    void ButtonSubmitOnAction(ActionEvent event) {
        if (ComboBoxCompany.getSelectionModel().isEmpty() || TextFieldJobTitle.getText().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Fill in all information", ButtonType.OK).showAndWait();
        }
        else{
            String companyName = ComboBoxCompany.getSelectionModel().getSelectedItem();
            Company selectedCompany = null;
            for (Company c: DataStorage.getCompanies()) {
                if (c.getName().equals(companyName)) {
                    selectedCompany = c;
                    break;
                }
            }
            JobOffer jobOffer = new JobOffer(selectedCompany,TextFieldJobTitle.getText(),TextAreaInfo.getText());
            ArrayList<JobOffer> jobOffers = DataStorage.getJobOffers();
            jobOffers.add(jobOffer);
            DataStorage.setJobOffers(jobOffers);
            WindowReference.getParentController().switchToMain();
        }
    }

    public void init(){
        ArrayList<String> companyNames = new ArrayList<>();
        for (Company c: DataStorage.getCompanies()) {
            companyNames.add(c.getName());
        }
        ComboBoxCompany.getItems().addAll(companyNames);
    }
}
