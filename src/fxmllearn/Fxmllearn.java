/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmllearn;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author William Wang
 */
public class Fxmllearn extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
   URL location = getClass().getResource("FXMLDocument.fxml");
     FXMLLoader rootfxml=new FXMLLoader(location);
        Pane root = (Pane)rootfxml.load();

//add record
FXMLDocumentController controller = (FXMLDocumentController)rootfxml.getController();
try
{
controller.fillPerson();
}catch(Exception e)
{
    e.printStackTrace();
}

        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
