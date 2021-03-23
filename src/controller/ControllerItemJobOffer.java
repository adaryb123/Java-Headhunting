package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.JobOffer;

public class ControllerItemJobOffer {

    @FXML
    private Label LabelJobOffer;

    @FXML
    private Label LabelCompany;

    @FXML
    private ImageView ImageViewCompany;

    @FXML
    void ButtonDetailsOnAction(ActionEvent event) {
        System.out.println("CLICKED " + jobOffer.getJobTitle());
    }

    JobOffer jobOffer;

    public void init(JobOffer jobOffer){
        this.jobOffer = jobOffer;
        LabelJobOffer.setText(jobOffer.getJobTitle());
        LabelCompany.setText(jobOffer.getCompany().getName());
        ImageViewCompany.setImage(new Image(jobOffer.getCompany().getlogoImageURI()));
    }
}
