package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerSceneMain {

    @FXML
    private Button ButtonAddFreelancer;

    @FXML
    private Button ButtonAddCompany;

    @FXML
    private Button ButtonAddJobOffer;

    @FXML
    void ButtonAddCompanyOnAction(ActionEvent event) {
        WindowReference.getParentController().switchToAddCompany();
    }

    @FXML
    void ButtonAddFreelancerOnAction(ActionEvent event) {
        WindowReference.getParentController().switchToAddFreelancer();
    }

    @FXML
    void ButtonAddJobOfferOnAction(ActionEvent event) {
        WindowReference.getParentController().switchToAddJobOffer();
    }


    public void init(){

    }
}

