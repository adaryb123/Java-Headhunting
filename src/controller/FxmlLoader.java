package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import main.Main;

import java.io.FileNotFoundException;
import java.net.URL;

/**
 * this class is based on code from https://www.youtube.com/watch?v=5yQbt6lYRqk
 */
public class FxmlLoader {
         private static Pane view;

         public static Pane getPage(String fileName){
             try{
                 URL fileURL = Main.class.getResource( "/view/" + fileName + ".fxml");
                 if (fileURL == null)
                     throw new FileNotFoundException("Cannot find FXML file");

                 view = new FXMLLoader().load(fileURL);
             }
             catch (Exception e) {
                 System.out.println(e.getMessage());
             }
             return view;
         }
}
