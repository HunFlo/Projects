/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigenes_projekt_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Florian
 */
public class BuchungssystemController implements Initializable {

    private TextField Text;
    @FXML
    private Button BuchenButton;
    @FXML
    private TextField SollText;
    @FXML
    private TextField HabenText;
    @FXML
    private Button CancelButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Buchenbutton(ActionEvent event) throws IOException {
        String Soll = SollText.getText();
        String Haben = HabenText.getText();
        String path = State2.getState2().getPath();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write("Soll: " + Soll + "\r\n");
        writer.write("Haben: " + Haben + "\r\n");
        writer.close();
    }

    @FXML
    private void SollText(ActionEvent event) {
    }

    @FXML
    private void HabenText(ActionEvent event) {
    }

    @FXML
    private void CancelButton(ActionEvent event) {
    }
    
    
    
    
}
