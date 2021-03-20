package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

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
        Pane view = FxmlLoader.getPage("sceneMain");
        BorderPaneContent.setCenter(view);
    }

    @FXML
    void ButtonScreen2OnAction(ActionEvent event) {
        Pane view = FxmlLoader.getPage("sceneAddFreelancer");
        BorderPaneContent.setCenter(view);
    }

    public void switchToAddFreelancer(){
        Pane view = FxmlLoader.getPage("sceneAddFreelancer");
        BorderPaneContent.setCenter(view);
    }

}
