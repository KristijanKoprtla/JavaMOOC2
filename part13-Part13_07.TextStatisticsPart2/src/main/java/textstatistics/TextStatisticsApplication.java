package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{
    
    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        HBox textComponents = new HBox();
        TextArea text = new TextArea();
        
        textComponents.setSpacing(20);
        
        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is: ");
        
        textComponents.getChildren().addAll(lettersLabel, wordsLabel, longestWordLabel);
        
        layout.setCenter(text);
        layout.setBottom(textComponents);
        
        text.textProperty().addListener((change, oldValue, newValue) -> {
            int letters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            //Update labels
            lettersLabel.setText("Letters: " + letters);
            wordsLabel.setText("Words: " + words);
            longestWordLabel.setText("The longest word is: " + longest);
        });
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
        
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
