package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.JobOffer;

public class ControllerItemJobOffer {

    @FXML
    private Label LabelItemNumber;

    @FXML
    private Button ButtonDetails;

    @FXML
    void ButtonDetailsOnAction(ActionEvent event) {
        System.out.println("CLICKED " + jobOffer.getJobTitle());
    }

    JobOffer jobOffer;

    public void init(JobOffer jobOffer){
        this.jobOffer = jobOffer;
        LabelItemNumber.setText(jobOffer.getJobTitle());
    }
}
