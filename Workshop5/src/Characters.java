package lab5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.geometry.Pos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Characters extends Application {

    @Override
    public void start(Stage primaryStage) {


        Pane pane = new Pane();
        
        pane.setPrefSize(600, 600);

        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 35);

        String print = "Welcome to Java";
        
        double rotation = 25;
        
        double offset = pane.getPrefWidth() / 2;
        
        double radius = 115;
        
        double x = offset + Math.cos(rotation) * radius;
        double y = offset + Math.sin(rotation) * radius;

        for (int i = 0; i <print.length(); i++) {
        	
            x = offset + Math.cos(Math.toRadians(rotation)) * radius;
            y = offset + Math.sin(Math.toRadians(rotation)) * radius;

            Text text = new Text(x, y, print.charAt(i) + "");

            text.setFont(font);
            
            text.setRotate(rotation);
            
            pane.getChildren().add(text);
            
            rotation += 22;
        }

        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Welcome to Java");
        
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}