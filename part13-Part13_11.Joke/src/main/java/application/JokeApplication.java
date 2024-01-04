package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{
    
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        layout.setPrefSize(400, 400);
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button first = new Button("Joke");
        Button second = new Button("Answer");
        Button third = new Button("Explanation");
        
        menu.getChildren().addAll(first, second, third);
        
        layout.setTop(menu);
        
        
        StackPane jokeLayout = createView("What do you call a bear with no teeth?");
        StackPane answerLayout = createView("A gummy bear.");
        StackPane explanationLayout = createView("Bear skipped the dentist.");
        
        layout.setCenter(jokeLayout);
        
        
        
        first.setOnAction((event) -> layout.setCenter(jokeLayout));
        second.setOnAction((event) -> layout.setCenter(answerLayout));
        third.setOnAction((event) -> layout.setCenter(explanationLayout));
        
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
 
    }
    
    private StackPane createView(String text){
        StackPane layout = new StackPane();
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
