import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the main dashboard FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MetroRailDashboard.fxml"));

        // Set up the scene and stage
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Dhaka Metro Rail");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
