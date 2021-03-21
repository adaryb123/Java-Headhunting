package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import model.Freelancer;
import model.Programmer;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class ControllerWindow {

    @FXML
    private BorderPane BorderPaneContent;

    @FXML
    private HBox HBoxHeader;

    @FXML
    private Button ButtonScreen1;

    @FXML
    private Button ButtonScreen2;

    public ControllerWindow(){
        WindowReference.setParentController(this);
    }

    @FXML
    void ButtonScreen1OnAction(ActionEvent event) {
        switchToMain();
    }

    @FXML
    void ButtonScreen2OnAction(ActionEvent event) {
        switchToMain();
    }

    public void switchToAddFreelancer(){
        FXMLLoader fxmlLoader = SceneManager.getPage(BorderPaneContent,"sceneAddFreelancer");
        ((ControllerSceneAddFreelancer) fxmlLoader.getController()).init();
        //BorderPaneContent.setCenter(view);
    }

    public void switchToAddCompany(){
        FXMLLoader fxmlLoader = SceneManager.getPage(BorderPaneContent,"sceneAddCompany");
        ((ControllerSceneAddCompany) fxmlLoader.getController()).init();
        //BorderPaneContent.setCenter(view);
    }

    public void switchToAddJobOffer(){
        FXMLLoader fxmlLoader = SceneManager.getPage(BorderPaneContent,"sceneAddJobOffer");
        ((ControllerSceneAddJobOffer) fxmlLoader.getController()).init();
        //BorderPaneContent.setCenter(view);
    }
    public void switchToMain() {
        FXMLLoader fxmlLoader = SceneManager.getPage(BorderPaneContent, "sceneMain");
        ((ControllerSceneMain) fxmlLoader.getController()).init();
        //BorderPaneContent.setCenter(view);
    }



    }
