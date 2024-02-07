import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primarystage){
        try {
            primarystage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/Dashboard.fxml"))));
            primarystage.centerOnScreen();
            primarystage.setTitle("E & E Service Center");
            primarystage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
