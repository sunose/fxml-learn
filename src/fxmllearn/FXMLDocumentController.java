/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmllearn;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author William Wang
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;

    @FXML private TableView<Person> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
@FXML
    protected void addPerson(ActionEvent event) {
        ObservableList<Person> data = tableView.getItems();
        data.add(new Person(firstNameField.getText(),
            lastNameField.getText(),
            emailField.getText()
        ));
        
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");   
    }   
@FXML
    protected void fillPerson() {
        java.util.Random rand =new java.util.Random(8);
        int count=0;
        for(int i=0;i<20;i++)
        {
        count=rand.nextInt(i+1);
        ObservableList<Person> data = tableView.getItems();
        data.add(new Person("William Wang "+count,
            "LastName "+count,
            "email@emai.com "+count
        ));
        }
    }
  @FXML 
  protected void handleSubmitButtonAction(ActionEvent event)  
  {
Alert alert;
        alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle("Information Dialog");
alert.setHeaderText("Look, an Information Dialog");
alert.setContentText("I have a great message for you!");
    alert.showAndWait();      
  }
}
