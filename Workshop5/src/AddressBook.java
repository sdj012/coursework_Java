package lab5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class AddressBook extends Application {
  @Override 
  public void start(Stage primaryStage) {

  GridPane pane = new GridPane();
    pane.setPadding(new Insets(11, 12, 13, 14));

    pane.setHgap(5);
    pane.setVgap(5);
    pane.setAlignment(Pos.CENTER);

    pane.add(new Label("First Name:"), 0, 0);
    pane.add(new TextField(),1,0);

    pane.add(new Label("Last Name:"),0,1);
    pane.add(new TextField(),1,1);
    
    pane.add(new Label("City:"),0,2);
    pane.add(new TextField(),1,2);
    
    pane.add(new Label("Province:"),2,2);
  
    ChoiceBox<String> choiceBox = new ChoiceBox<String>();
    choiceBox.getItems().addAll("Ontario", "Quebec", "P.E.I","Manitoba","Saskatchewan");
    pane.add(choiceBox,3,2);
    primaryStage.show(); 
    
    pane.add(new Label("Postal Code:"),4,2);
    pane.add(new TextField(),5,2);
    

    Scene scene = new Scene(pane,800, 200);
    primaryStage.setTitle("Address Book"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
    
    
    pane.add(new Button("Add"),0,4);   

    primaryStage.show(); 
    
    pane.add(new Button("First"),1,4);   
    primaryStage.show(); 
    
    pane.add(new Button("Next"),2,4);   
    primaryStage.show(); 
    
    pane.add(new Button("Previous"),3,4);   
    primaryStage.show(); 
    
    pane.add(new Button("Last"),4,4);   
    primaryStage.show(); 
    
    pane.add(new Button("Update"),5,4);   
    primaryStage.show(); 


  }
  
  public static void main(String[] args) {
	    launch(args);
	  }
}


  
  

  



