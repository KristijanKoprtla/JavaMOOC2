package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication  extends Application{
    
    public void start(Stage window) {
        VBox vbox = new VBox();
        TextField text = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event) -> {
            label.setText(text.getText());
        });
        
        vbox.getChildren().addAll(text, button, label);
        
        Scene scene = new Scene(vbox);
        
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
