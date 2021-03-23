package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.JobOffer;

import java.util.ArrayList;

public class ControllerSceneMain {

    @FXML
    private VBox VBoxItemHolder;

    private ArrayList<AnchorPane> listingItems = new ArrayList<>();

    ArrayList<JobOffer> jobOffers = new ArrayList<>();

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

    /*
    this code is based on code from previous project, https://github.com/DavidSilady/FreelancePortalJava
     */
    public void init(){
        DataStorage.createInitialData();
        jobOffers = DataStorage.getJobOffers();

        VBoxItemHolder.getChildren().clear();
        listingItems.clear();

        for (JobOffer jobOffer : jobOffers) {
            AnchorPane itemPane = new AnchorPane();
            FXMLLoader fxmlLoader = SceneManager.switchListingPane(itemPane, "itemJobOffer");
            ControllerItemJobOffer controller = fxmlLoader.getController();
            controller.init(jobOffer);
            listingItems.add(itemPane);
        }

        VBoxItemHolder.getChildren().addAll(listingItems);
    }
}

