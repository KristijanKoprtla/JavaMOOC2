package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public void start(Stage window) {
        //First view
        BorderPane bp = new BorderPane();
        
        Label text = new Label("First view!");
        Button next = new Button("To the second view!");
        
        bp.setTop(text);
        bp.setCenter(next);

        Scene first = new Scene(bp);
        
        //Second view
        VBox vbox = new VBox();
        
        Button toThirdButton = new Button("To the third view!");
        Label textSecond = new Label("Second view!");
        
        vbox.getChildren().addAll(toThirdButton, textSecond);
        
        Scene second = new Scene(vbox);


        
        
        
        //Third view
        GridPane gridLayout = new GridPane();
        
        Button toFirstView = new Button("To the first view!");
        
        gridLayout.add(new Label("Third view!"), 0, 0);
        gridLayout.add(toFirstView, 1, 1);
        
        Scene third = new Scene(gridLayout);
        
        //event handlers
        
        next.setOnAction((event) -> {
            window.setScene(second);
        });
        toThirdButton.setOnAction((event) -> {
            window.setScene(third);
        });
        
        toFirstView.setOnAction((event) -> {
            window.setScene(first);
        });



        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);

    }

}
