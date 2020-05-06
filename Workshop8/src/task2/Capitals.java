package task2;

import java.util.TreeMap;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Capitals extends Application{
	
	public static TreeMap<String,String> countrycapital=new TreeMap<String,String>() {{ 
		put("CANADA","Ottawa");put("UNITED STATES","Washington D.C");put("MEXICO", "Mexico City");
		
	}};
	
	@Override
	
	public void start(final Stage primaryStage) {	
		

	 final GridPane pane = new GridPane();
	    pane.setPadding(new Insets(11, 12, 13, 14));

	    pane.setHgap(5);
	    pane.setVgap(5);
	    pane.setAlignment(Pos.CENTER);

	    pane.add(new Label("Enter a Country: "), 0, 0);
	    final TextField country= new TextField();
	    pane.add(country,1,0);
	    
	    Button Submit= new Button("Submit");
	    pane.add(Submit,1,1);   
	    primaryStage.show(); 
	    
	    Scene scene = new Scene(pane,600, 200);
	    primaryStage.setTitle("QuizApplication"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show(); 
	    
	    Submit.setOnAction( new EventHandler<ActionEvent>() {
	    	
	    	public void handle(ActionEvent event) {
	    		
	    		String returnStr=search(country.getText().toUpperCase());
	    		
	    		final GridPane pane1 = new GridPane();
	    		
	    		pane1.setPadding(new Insets(11, 12, 13, 14));

	    	    pane1.setHgap(5);
	    	    pane1.setVgap(5);
	    	    pane1.setAlignment(Pos.CENTER);
	    		
	    		pane1.add(new Label("Capital: "+ returnStr),0,0);
	    		 
	     	    final TextField yorn= new TextField();
	    	    pane1.add(new Label("Do you want to Search for another capital city? (Y or N) "),1,1);
	    	    pane1.add(yorn,1,3);
	    	    
	    	    Button Submit2= new Button("Submit");
	    	    pane1.add(Submit2,1,4);
	    	    
	    	    
	    	    Scene scene1 = new Scene(pane1,600, 200);
	    	    primaryStage.setTitle("QuizApplication"); 
	    	    primaryStage.setScene(scene1); 
	    	    primaryStage.show(); 
	    	    
	    	    
	    	    Submit2.setOnAction( new EventHandler<ActionEvent>() {
	    	    	
	    	    	public void handle(ActionEvent event) {
	    	    		
	    	    		if(yorn.getText().toUpperCase().matches("Y")){
	    	    			
	    	    			start(primaryStage);
	    	    			
	    	    		
	    	    		}else if(yorn.getText().toUpperCase().matches("N")) {
	    	    			primaryStage.close();
	    	    		}
	    			
	    	    	};
	    	    });
	    		 
	 
	    		
	    	}
	    		
		});
	    
	}
	
	public static String search(String country) {
		
	if(countrycapital.containsKey(country)) return countrycapital.get(country);
	else return "Country Not Found";
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	   
}
