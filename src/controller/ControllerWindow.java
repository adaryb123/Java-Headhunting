package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

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
        FXMLLoader fxmlLoader  = SceneManager.getPage(BorderPaneContent,"sceneMain");
        //BorderPaneContent.setCenter(view);
    }

    @FXML
    void ButtonScreen2OnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = SceneManager.getPage(BorderPaneContent,"sceneAddFreelancer");
        ((ControllerSceneAddFreelancer) fxmlLoader.getController()).init();
        //BorderPaneContent.setCenter(view);
    }

    public void switchToAddFreelancer(){
        FXMLLoader fxmlLoader = SceneManager.getPage(BorderPaneContent,"sceneAddFreelancer");
        ((ControllerSceneAddFreelancer) fxmlLoader.getController()).init();
        //BorderPaneContent.setCenter(view);
    }

}
