/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigenes_projekt_3;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
public class Filesystem implements Initializable {

    @FXML
    private TextField Filename;
    @FXML
    private Button Confirm;
    @FXML
    private Button Cancel;
    public String name;
    public int zahl;
    @FXML
    private Spinner<Integer> Spinner;
    @FXML
    public String absoluteFilePath;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //initialization of the spinners
        final int initialValue = 0;
           SpinnerValueFactory<Integer> valueFactory2 =//
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, initialValue);
 
        Spinner.setValueFactory(valueFactory2);
    }

    @FXML
    private void Fillename(ActionEvent event) {
       
    }

    @FXML
    private void Confirm(ActionEvent event) throws IOException {
        //concatenate of the Filename
        name = Filename.getText();
        zahl = Spinner.getValue();
        String complete = name + zahl;
        
        //Get Foldername
        String folderName = State.getState().getFolderName();
        
        //Define the absosulte Filepath
        absoluteFilePath = "C:\\Users\\flohu\\Desktop\\" + folderName + "\\" + complete + ".txt";
        //save absolute Filepath for later 
        State2.getState2().setPath(absoluteFilePath);
        //Create File
        File file = new File(absoluteFilePath);
         try {
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "File created", "Information", INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "File not created", "Warning", WARNING_MESSAGE);
            }
        } catch (Exception e) {
        }
        //Closing Window after Confirming
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

}
