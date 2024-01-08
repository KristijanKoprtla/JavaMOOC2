package smiley;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        // Create a Canvas in the middle of the BorderPane
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Set the background color to white
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Draw a smiley
        drawSmiley(gc);

        layout.setCenter(canvas);

        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Smiley App");
        stage.show();
    }

    private void drawSmiley(GraphicsContext gc) {
        // Set the color to black
        gc.setFill(Color.BLACK);
        

        // Draw the face
        gc.fillOval(50, 50, 300, 300);
        gc.setFill(Color.WHITE);

        // Draw the left eye
        gc.fillOval(120, 120, 40, 40);
        gc.setFill(Color.WHITE);

        // Draw the right eye
        gc.fillOval(240, 120, 40, 40);
        gc.setFill(Color.WHITE);

        // Draw the mouth (smile)
        gc.setFill(Color.WHITE);
        gc.fillArc(120, 200, 160, 80, 0, -180, ArcType.OPEN);
    }
}