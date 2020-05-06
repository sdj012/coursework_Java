package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import java.util.Random;


public class Main extends Application {
	@Override
	public void start(final Stage primaryStage) {
		
		 Random rand = new Random(); 
	
		int A=rand.nextInt(10); ;
		
		int B=rand.nextInt(10); ;
		final String yorn="";
		
			quizWindows.calculateAnswers((double)A,(double)B);
		
		  final GridPane pane = new GridPane();
		    pane.setPadding(new Insets(11, 12, 13, 14));

		    pane.setHgap(5);
		    pane.setVgap(5);
		    pane.setAlignment(Pos.CENTER);

		    pane.add(new Label("Enter the sum of " + A +" and "+ B +" :"), 0, 0);
		    final TextField sum= new TextField();
		    pane.add(sum,1,0);

		    pane.add(new Label("Enter the difference of " + A +" and "+ B +" :"),0,1);
		    final TextField difference= new TextField();
		    pane.add(difference,1,1);
		    
		    pane.add(new Label("Enter product of " + A +" and "+ B +" :"),0,2);
		    final TextField product= new TextField();
		    pane.add(product,1,2);
		    
		    pane.add(new Label("Enter quotient of " + A +" and "+ B +" :" +"\n" + "Please round to two decimal points \n (if indivisible, enter 'null')"),0,3);
		    final TextField quotient= new TextField();
		    pane.add(quotient,1,3);

		    Button Submit= new Button("Submit");
		    pane.add(Submit,1,6);   
		    primaryStage.show(); 
		    
	    	pane.add(new Label("Try with two other numbers? (Y or N) :"),0,7);
		    final TextField tryAgain= new TextField();
		    pane.add(tryAgain,1,7);
		    
		    Button Submit2= new Button("Submit");
		    pane.add(Submit2,1,8);   
		    primaryStage.show(); 
		    
		    
		    Scene scene = new Scene(pane,500, 400);
		    primaryStage.setTitle("QuizApplication"); 
		    primaryStage.setScene(scene); 
		    primaryStage.show(); 
		    

		    Submit.setOnAction( new EventHandler<ActionEvent>() {
		    	
		    	public void handle(ActionEvent event) {
	
			    
			    int[] corrincorr=quizWindows.calculateCorrect(sum.getText(), difference.getText(), product.getText(), quotient.getText());
			    
			    pane.add(new Label("Number of Correct Answers: " + corrincorr[0] ),0,4);
			    pane.add(new Label("Number of Wrong Answers: " + corrincorr[1]),0,5);
			    
		    	};
		    });
		    
    	    Submit2.setOnAction( new EventHandler<ActionEvent>() {
    	    	
    	    	public void handle(ActionEvent event) {
    	    		
    	    		if(tryAgain.getText().toUpperCase().matches("Y")){
    	    			
    	    			start(primaryStage);
    	    			
    	    		
    	    			
    	    		}else if(tryAgain.getText().toUpperCase().matches("N")) {
    	    			primaryStage.close();
    	    		}
    			
    	    	};
    	    });
		    

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
