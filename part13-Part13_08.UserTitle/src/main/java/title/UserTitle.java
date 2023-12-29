package title;

import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application{

    public void start(Stage window) {
        Parameters params = getParameters();
        String userTitle = params.getNamed().get("userTitle");
        
        window.setTitle(userTitle);
        window.show();
    }

}
