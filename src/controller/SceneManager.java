package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import main.Main;

/**
 * this class is based on code from https://www.youtube.com/watch?v=5yQbt6lYRqk
 */
public class SceneManager {
         private static Pane view;

         public static FXMLLoader getPage(BorderPane parentPane, String fileName){
             FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource( "/view/" + fileName + ".fxml"));
             try{
               /*  URL fileURL = Main.class.getResource( "/view/" + fileName + ".fxml");
                 if (fileURL == null)
                     throw new FileNotFoundException("Cannot find FXML file");

                 Pane childPane = fxmlLoader.load(fileURL);*/
                 Pane childPane = fxmlLoader.load();
                 parentPane.setCenter(childPane);
             }
             catch (Exception e) {
                 System.out.println(e.getMessage());
             }
             return fxmlLoader;
         }
}
