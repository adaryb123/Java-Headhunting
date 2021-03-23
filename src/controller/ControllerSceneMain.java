package controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import main.Main;
import model.Company;
import model.JobOffer;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerSceneMain {

    @FXML
    private Button ButtonAddFreelancer;

    @FXML
    private Button ButtonAddCompany;

    @FXML
    private Button ButtonAddJobOffer;

    @FXML
    private HBox scrollHbox;

    @FXML
    private javafx.scene.control.ScrollPane ScrollPane;

    @FXML
    private ArrayList<AnchorPane> listingPanes = new ArrayList<>();

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

        Company company = new Company("TESLA","IT",500,"empty");

        JobOffer job1 = new JobOffer(company,"baker","bake bread");
        JobOffer job2 = new JobOffer(company,"janitor","clean floor");
        jobOffers.add(job1);
        jobOffers.add(job2);

        ScrollPane.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.NEVER);
        ScrollPane.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.AS_NEEDED);

        scrollHbox.getChildren().clear();
        listingPanes.clear();

        for (JobOffer jobOffer : jobOffers) {
            AnchorPane listingPane = new AnchorPane();
            SceneManager sceneManager = new SceneManager();
            FXMLLoader fxmlLoader = sceneManager.getPage2(listingPane, "itemJobOffer");
            ControllerItemJobOffer controller = fxmlLoader.getController();
            controller.init(jobOffer);
            listingPanes.add(listingPane);
        }

        VBox listingBox = new VBox(10);

        listingBox.maxHeight(2160);
        listingBox.getChildren().addAll(listingPanes);

        scrollHbox.getChildren().addAll(listingBox);
        listingBox.setAlignment(Pos.CENTER);
        scrollHbox.setAlignment(Pos.CENTER);
        ScrollPane.setVvalue(0);
    }
}

