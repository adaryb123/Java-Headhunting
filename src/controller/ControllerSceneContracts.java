package controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import model.Contract;
import model.Freelancer;

import java.util.ArrayList;

public class ControllerSceneContracts {

    @FXML
    private TableView<Contract> TableViewContracts;

    @FXML
    private TableColumn<Contract, String> TableColumnPosition;

    @FXML
    private TableColumn<Contract, String> TableColumnCompany;

    @FXML
    private TableColumn<Contract, String> TableColumnDate;

    @FXML
    private TableColumn<Contract, String> TableColumnFreelancers;

    @FXML
    private TextArea TextAreaFreelancers;

    private ObservableList<Contract> contracts = FXCollections.observableArrayList();

    private ArrayList<Freelancer> selectedFreelancers = new ArrayList<>();

    @FXML
    void ButtonEndContractOnAction(ActionEvent event) {
        DataStorage.updateAvailableFreelancers(selectedFreelancers,true);
        Contract selectedContract = TableViewContracts.getSelectionModel().getSelectedItem();
        contracts.remove(selectedContract);

        ArrayList<Contract> newContracts = new ArrayList<>();
        newContracts.addAll(contracts);
        DataStorage.setContracts(newContracts);
        WindowReference.getParentController().switchToMain();
    }

    @FXML
    void ButtonViewFreelancersOnAction(ActionEvent event) {
        selectedFreelancers.clear();
        selectedFreelancers.addAll(TableViewContracts.getSelectionModel().getSelectedItem().getFreelancers());

        for (Freelancer f: selectedFreelancers){
            TextAreaFreelancers.appendText(f.getName() + ", " + f.getClass().toString().substring(12) + "\n");
        }
    }

    public void init(){
        contracts.clear();
        contracts.addAll(DataStorage.getContracts());

        TableColumnPosition.setCellValueFactory(lambda -> new ReadOnlyStringWrapper(lambda.getValue().getJobOffer().getJobTitle()));
        TableColumnCompany.setCellValueFactory(lambda -> new ReadOnlyStringWrapper(lambda.getValue().getJobOffer().getCompany().getName()));
        TableColumnDate.setCellValueFactory(lambda -> new ReadOnlyStringWrapper(lambda.getValue().getDate()));
        TableColumnFreelancers.setCellValueFactory(lambda -> new ReadOnlyStringWrapper(String.valueOf(lambda.getValue().getFreelancers().size())));

        TableViewContracts.setItems(contracts);
        TextAreaFreelancers.setText("");
    }
}
