package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import model.Company;
import model.Freelancer;

import java.io.File;
import java.util.ArrayList;

public class ControllerSceneAddCompany {

    @FXML
    private ImageView ImagePlaceholder;

    @FXML
    private Button ButtonChooseFile;

    @FXML
    private TextField TextFieldCompanyName;

    @FXML
    private TextField TextFieldFieldOfBusiness;

    @FXML
    private Spinner<Integer> SpinnerEmployeesNumber;

    @FXML
    private Button ButtonSubmit;

    private String imageURI;

    /*
    this code is based on code from https://www.youtube.com/watch?v=hNz8Xf4tMI4
     */
    @FXML
    void ButtonChooseFileOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("C:\\Users\\uzivatel\\Desktop\\workspace\\zadanie2\\src\\view\\images"));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif", "*.jpeg", "*.bmp"));
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null){
            imageURI = selectedFile.toURI().toString();
            ImagePlaceholder.setImage(new Image(imageURI));
        }
    }

    @FXML
    void ButtonSubmitOnAction(ActionEvent event) {
        if(TextFieldCompanyName.getText().isEmpty() || TextFieldFieldOfBusiness.getText().isEmpty()){
            new Alert(Alert.AlertType.ERROR,"Fill in all information",ButtonType.OK).showAndWait();
        }
        else{
            Company company = new Company(TextFieldCompanyName.getText(),TextFieldFieldOfBusiness.getText(),
                    SpinnerEmployeesNumber.getValue(),imageURI);

            ArrayList<Company> companies = DataStorage.getCompanies();
            companies.add(company);
            DataStorage.setCompanies(companies);
            WindowReference.getParentController().switchToMain();
        }
    }

    public void init(){
        SpinnerValueFactory<Integer> possibleValues = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10000,10);
        SpinnerEmployeesNumber.setValueFactory(possibleValues);
    }

}
