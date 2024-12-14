import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MetroRailDashboardController {

    @FXML
    private Button bookticket;
    @FXML
    private Button feedback;
    @FXML
    private Button rechargecard;
    @FXML
    private Button enterstation;
    @FXML
    private Button exitstation;

    @FXML
    public void BookTicket() throws IOException {
        switchScene("BookTicketScene.fxml", "BookTicketController");
    }

    @FXML
    public void ViewTrainSchidule() throws IOException {
        switchScene("TrainScheduleScene.fxml", "TrainScheduleController");
    }

    @FXML
    public void PassangersFeedback() throws IOException {
        switchScene("FeedbackScene.fxml", "FeedbackController");
    }

    @FXML
    public void CancleTicket() throws IOException {
        switchScene("CancelTicketScene.fxml", "CancelTicketController");
    }

    @FXML
    public void RechargeMetroCard() throws IOException {
        switchScene("RechargeCardScene.fxml", "RechargeCardController");
    }

    @FXML
    public void CheckBallanceOnMetro() throws IOException {
        switchScene("CheckBalanceScene.fxml", "CheckBalanceController");
    }

    @FXML
    public void ExitMetroStation() throws IOException {
        switchScene("ExitStationScene.fxml", "ExitStationController");
    }

    @FXML
    public void EnterMetroStation() throws IOException {
        switchScene("EnterStationScene.fxml", "EnterStationController");
    }

    private void switchScene(String fxmlFile, String controllerName) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        loader.setControllerFactory(param -> {
            try {
                return Class.forName(controllerName).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        });
        Scene newScene = new Scene(loader.load());
        Stage stage = (Stage) bookticket.getScene().getWindow();
        stage.setScene(newScene);
        stage.show();
    }
}

