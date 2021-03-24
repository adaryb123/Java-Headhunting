package controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Contract;
import model.Freelancer;
import model.JobOffer;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class ControllerSceneJobOfferDetail {

    @FXML
    private Label LabelJobOfferName;

    @FXML
    private Label LabelCompanyName;

    @FXML
    private Label LabelJobOfferInfo;

    @FXML
    private ImageView ImageViewCompanyLogo;

    @FXML
    private TableView<Freelancer> TableViewAssignedFreelancers;

    @FXML
    private TableColumn<Freelancer, String> TableAssignedColumnName;

    @FXML
    private TableColumn<Freelancer, String> TableAssignedColumnOccupation;

    @FXML
    private TableView<Freelancer> TableViewAvailableFreelancers;

    @FXML
    private TableColumn<Freelancer, String> TableAvailableColumnName;

    @FXML
    private TableColumn<Freelancer, String> TableAvailableColumnOccupation;


    @FXML
    private Label LabelCompanyName1;

    @FXML
    private Label LabelCompanyName11;

    private JobOffer jobOffer;

    private ObservableList<Freelancer> assignedFreelancers = FXCollections.observableArrayList();

    private ObservableList<Freelancer> availableFreelancers = FXCollections.observableArrayList();

    @FXML
    void ButtonAssignSelectedOnAction(ActionEvent event) {
       ObservableList<Freelancer> selectedFreelancers = TableViewAvailableFreelancers.getSelectionModel().getSelectedItems();
        assignedFreelancers.addAll(selectedFreelancers);
        availableFreelancers.removeAll(selectedFreelancers);

        TableViewAvailableFreelancers.setItems(availableFreelancers);
        TableViewAssignedFreelancers.setItems(assignedFreelancers);
    }

    @FXML
    void ButtonCreateContractOnAction(ActionEvent event) {
        if (assignedFreelancers.isEmpty()){
            new Alert(Alert.AlertType.ERROR,"You must assign freelancers first", ButtonType.OK).showAndWait();
        }
        else{
            ArrayList<Freelancer> selectedFreelancers = new ArrayList<>();
            selectedFreelancers.addAll(TableViewAvailableFreelancers.getSelectionModel().getSelectedItems());
            for (Freelancer f: selectedFreelancers)
                f.setAvailable(false);
            DataStorage.updateAvailableFreelancers(selectedFreelancers);

            ArrayList<Contract> contracts = DataStorage.getContracts();
            contracts.add(new Contract(jobOffer,selectedFreelancers));
            DataStorage.setContracts(contracts);
            WindowReference.getParentController().switchToMain();
        }
    }

    @FXML
    void ButtonRemoveSelectedOnAction(ActionEvent event) {
        ObservableList<Freelancer> selectedFreelancers = TableViewAssignedFreelancers.getSelectionModel().getSelectedItems();
        availableFreelancers.addAll(selectedFreelancers);
        assignedFreelancers.removeAll(selectedFreelancers);

        TableViewAvailableFreelancers.setItems(availableFreelancers);
        TableViewAssignedFreelancers.setItems(assignedFreelancers);
    }

    public void init(JobOffer jobOffer){
        this.jobOffer = jobOffer;
        LabelCompanyName.setText(jobOffer.getCompany().getName());
        LabelJobOfferName.setText(jobOffer.getJobTitle());
        LabelJobOfferInfo.setText(jobOffer.getInfo());
        ImageViewCompanyLogo.setImage(new Image(jobOffer.getCompany().getlogoImageURI()));

        availableFreelancers.clear();
        assignedFreelancers.clear();
        availableFreelancers.addAll(DataStorage.getAvailableFreelancers());

        TableAvailableColumnName.setCellValueFactory(lambda -> new ReadOnlyStringWrapper(lambda.getValue().getName()));
        TableAvailableColumnOccupation.setCellValueFactory(lambda -> new ReadOnlyStringWrapper(lambda.getValue().getClass().toString().substring(12)));
        TableAssignedColumnName.setCellValueFactory(lambda -> new ReadOnlyStringWrapper(lambda.getValue().getName()));
        TableAssignedColumnOccupation.setCellValueFactory(lambda -> new ReadOnlyStringWrapper(lambda.getValue().getClass().toString().substring(12)));

        TableViewAvailableFreelancers.setItems(availableFreelancers);
    }
}
