/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigenes_projekt_3;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 * FXML Controller class
 *
 * @author Florian
 */
public class Ordnersystem implements Initializable {

    @FXML
    private Button Confirm;
    @FXML
    private Button Cancel;
    @FXML
    private TextField textOrdner;
    @FXML
    private Label Nummer;
    @FXML
    private Label Name;
    @FXML
    private Spinner<Integer> Spinner;
    public String completename;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         final int initialValue = 0;
           SpinnerValueFactory<Integer> valueFactory1 = //
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, initialValue);
 
        Spinner.setValueFactory(valueFactory1);
        
        
        
    }    
    
    
    
    
    
    
    
    
    
    
    @FXML
    private void Confirm(ActionEvent event) {
        //Define number
        int zahl;
        zahl = Spinner.getValue();
        
        //Define name
        String text = "";
        text = textOrdner.getText();
        completename = text + zahl;
        //Save Foldername
        State.getState().setFolderName(completename);
        //create Folder
        File f = new File("C:\\Users\\flohu\\Desktop\\" + completename);
        try {
            if (f.mkdir()) {
                JOptionPane.showMessageDialog(null, "Directory created", "Information", INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Directory not created", "Warning", WARNING_MESSAGE);
            }
        } catch (Exception e) {
        }
        //Close Window after press confirm
        // get a handle to the stage
        Stage stage = (Stage) Confirm.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    @FXML
    private void Cancel(ActionEvent event) {
        
        // get a handle to the stage
        Stage stage = (Stage) Cancel.getScene().getWindow();
        // do what you have to do
        stage.close();
        
    }

    @FXML
    private void textOrdner(ActionEvent event) {
    }

    
    
}
