package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import main.Main;

/**
 * this class is based on code from https://www.youtube.com/watch?v=5yQbt6lYRqk
 */
public class SceneManager {

         public static FXMLLoader switchBorderPane(BorderPane parentPane, String fileName){
             FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource( "/view/" + fileName + ".fxml"));
             try{
                 Pane childPane = fxmlLoader.load();
                 parentPane.setCenter(childPane);
             }
             catch (Exception e) {
                 System.out.println(e.getMessage());
             }
             return fxmlLoader;
         }

    public static FXMLLoader switchListingPane(Pane parentPane, String fileName){
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource( "/view/" + fileName + ".fxml"));
        try{
            Pane childPane = fxmlLoader.load();
            parentPane.getChildren().clear();
            parentPane.getChildren().add(childPane);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return fxmlLoader;
    }
}
