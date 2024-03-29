/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigenes_projekt_3;

/**
 *
 * @author Florian
 */
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.stage.Stage;  

public class ImageExample extends Application {  
   @Override 
   public void start(Stage stage) throws FileNotFoundException {         
      //Creating an image 
      Image image = new Image(new FileInputStream("C:\\Users\\flohu\\Documents\\NetBeansProjects\\Eigenes_Projekt_3\\Icons\\Folder.jpg"));  
      
      //Setting the image view 
      ImageView imageView = new ImageView(image); 
      
      //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(455); 
      imageView.setFitWidth(500); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      
      //Creating a Group object  
      Group root = new Group(imageView);  
      
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 500);  
      
      //Setting title to the Stage 
      stage.setTitle("Loading an image");  
      
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show(); 
   }  
   public static void main(String args[]) { 
      launch(args); 
   } 
}
