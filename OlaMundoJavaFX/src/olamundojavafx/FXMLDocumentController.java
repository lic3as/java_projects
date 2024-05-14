/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafx;

import java.awt.Image;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author alice
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMessage;
    private Button btnSim;
    private Button btnNao;
    
    
    @FXML
    private void clicouSim(ActionEvent event) {
        lblMessage.setText("VIVA ^-^");
    }
    
    @FXML
    private void clicouNao(ActionEvent event){
        lblMessage.setText("Ah, não ;-;");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
