/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigenes_projekt_3;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 * FXML Controller class
 *
 * @author Florian
 */
public class StartController implements Initializable {

    @FXML
    private AnchorPane View;
    @FXML
    private Button buchen;
    @FXML
    private Button textfileErstellen;
    @FXML
    private Button ordnerErstellen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void buchen(ActionEvent event) {
        String absolutePath = State2.getState2().getPath();
        Path path = Paths.get(absolutePath);
        try {
            if (Files.exists(path)) {
                System.out.println(path);
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Buchungssystem.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();

            } else {
                JOptionPane.showMessageDialog(null, "Creat Dirextory and File first please", "Warning", WARNING_MESSAGE);
            }
        } catch (Exception e) {
        }

    }

    @FXML
    private void textfileErstellen(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(stage);
        
        
    }

    @FXML
    private void ordnerErstellen(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ordnersystem.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();

    }

}
