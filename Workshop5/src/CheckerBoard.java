package lab5;
import javafx.scene.shape.Rectangle;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.application.Application;

public class CheckerBoard extends Application {
	
	int i=0;

	public void start(Stage primaryStage) throws Exception{
	
	Group root = new Group();
	    // Create a pane and set its properties
	
	while(i<=350) {
	System.out.println(i);
	
	if(i+50<400) {
	
	
	  Rectangle r1 = new Rectangle();
	  
	  r1.setX(i); 
	  r1.setY(i+50);
	  r1.setWidth(50); 
	  r1.setHeight(50);
	  
	  root.getChildren().add(r1);
	  
	  Rectangle r5 = new Rectangle();
	  
	  r5.setX(i+50); 
	  r5.setY(i);
	  r5.setWidth(50); 
	  r5.setHeight(50);
	  
	  root.getChildren().add(r5);
	  
	}
	  
		
	if(i+150<400) {
	  
	  Rectangle r2 = new Rectangle();
	  
	  r2.setX(i); 
	  r2.setY(i+150);
	  r2.setWidth(50); 
	  r2.setHeight(50);
  
	  root.getChildren().add(r2);
	  
	  Rectangle r6 = new Rectangle();
	  
	  r6.setX(i+150); 
	  r6.setY(i);
	  r6.setWidth(50); 
	  r6.setHeight(50);
	  
	  root.getChildren().add(r6);
	  
	}
	  
		
	if(i+250<400) {
	  
	  Rectangle r3 = new Rectangle();
	  
	  r3.setX(i); 
	  r3.setY(i+250);
	  r3.setWidth(50); 
	  r3.setHeight(50);
	  
	  root.getChildren().add(r3);
	  

	  Rectangle r7 = new Rectangle();
	  
	  r7.setX(i+250); 
	  r7.setY(i);
	  r7.setWidth(50); 
	  r7.setHeight(50);
	  
	  root.getChildren().add(r7);
	}
	  
		
	if(i+350<400) {
	  
	  Rectangle r4 = new Rectangle();
	  
	  r4.setX(i); 
	  r4.setY(i+350);
	  r4.setWidth(50); 
	  r4.setHeight(50);
	  
	  root.getChildren().add(r4);
	  
	  
	}
	
	  i+=50;
	}
	
	System.out.println(i);
	  
	  Rectangle r8 = new Rectangle();
	  
	  r8.setX(350); 
	  r8.setY(0);
	  r8.setWidth(50); 
	  r8.setHeight(50);
	  
	  
	  root.getChildren().add(r8);
	  
	  Scene scene = new Scene(root ,400, 400);
	  
	  primaryStage.setScene(scene);

	  
	  primaryStage.show();
	  
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
