package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerSceneMain {

    @FXML
    private Button ButtonAddFreelancer;

    @FXML
    void ButtonAddFreelancerOnAction(ActionEvent event) {
        WindowReference.getParentController().switchToAddFreelancer();
    }

}

