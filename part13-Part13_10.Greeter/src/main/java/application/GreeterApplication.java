package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public void start(Stage window) {

        Label enterName = new Label("Enter your name and start.");
        TextField input = new TextField();
        Button start = new Button("Start");

        GridPane layout = new GridPane();
        layout.add(enterName, 0, 0);
        layout.add(input, 0, 1);
        layout.add(start, 0, 2);

        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene first = new Scene(layout);
        
        //Second view
        Label greetingText = new Label();
        GridPane layout2 = new GridPane();
        
        layout2.add(greetingText, 0, 0);
        
        layout2.setPrefSize(300, 180);
        layout2.setAlignment(Pos.CENTER);

        
        
        
        Scene second = new Scene(layout2);
        
        
        //event handler
        start.setOnAction((event) -> {
            greetingText.setText("Welcome " + input.getText() + "!");
            window.setScene(second);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
