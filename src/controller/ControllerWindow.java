package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import model.JobOffer;

public class ControllerWindow {

    @FXML
    private BorderPane BorderPaneContent;

    public ControllerWindow(){
        WindowReference.setParentController(this);
    }

    @FXML
    void ButtonHomeOnAction(MouseEvent event) {
        switchToMain();
    }

    public void switchToAddFreelancer(){
        FXMLLoader fxmlLoader = SceneManager.switchBorderPane(BorderPaneContent,"sceneAddFreelancer");
        ((ControllerSceneAddFreelancer) fxmlLoader.getController()).init();
    }

    public void switchToAddCompany(){
        FXMLLoader fxmlLoader = SceneManager.switchBorderPane(BorderPaneContent,"sceneAddCompany");
        ((ControllerSceneAddCompany) fxmlLoader.getController()).init();
    }

    public void switchToAddJobOffer(){
        FXMLLoader fxmlLoader = SceneManager.switchBorderPane(BorderPaneContent,"sceneAddJobOffer");
        ((ControllerSceneAddJobOffer) fxmlLoader.getController()).init();
    }

    public void switchToMain() {
        FXMLLoader fxmlLoader = SceneManager.switchBorderPane(BorderPaneContent, "sceneMain");
        ((ControllerSceneMain) fxmlLoader.getController()).init();
    }

    public void switchToJobOfferDetail(JobOffer jobOffer) {
        FXMLLoader fxmlLoader = SceneManager.switchBorderPane(BorderPaneContent, "sceneJobOfferDetail");
        ((ControllerSceneJobOfferDetail) fxmlLoader.getController()).init(jobOffer);
    }

    public void switchToContracts() {
        FXMLLoader fxmlLoader = SceneManager.switchBorderPane(BorderPaneContent, "sceneContracts");
        ((ControllerSceneContracts) fxmlLoader.getController()).init();
    }

}
