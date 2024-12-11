import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MetroRailDashboard {

    @FXML
    private Button bookticket;
    @FXML
    private Button feedback;
    @FXML
    private Button cancleticket;
    @FXML
    private Button rechargecard;
    @FXML
    private Button enterstation;
    @FXML
    private Button exitstation;

    // Handler for "Book a ticket"
    @FXML
    public void BookTicket() throws IOException {
        switchScene("BookTicketScene.fxml", "BookTicketController");
    }

    // Handler for "View Train Schedule"
    @FXML
    public void ViewTrainSchidule() throws IOException {
        switchScene("TrainScheduleScene.fxml", "TrainScheduleController");
    }

    // Handler for "Feedback"
    @FXML
    public void PassangersFeedback() throws IOException {
        switchScene("FeedbackScene.fxml", "FeedbackController");
    }

    // Handler for "Cancel Ticket"
    @FXML
    public void CancleTicket() throws IOException {
        switchScene("CancelTicketScene.fxml", "CancelTicketController");
    }

    // Handler for "Recharge Metro Card"
    @FXML
    public void RechargeMetroCard() throws IOException {
        switchScene("RechargeCardScene.fxml", "RechargeCardController");
    }

    // Handler for "Check Balance on Metro Card"
    @FXML
    public void CheckBallanceOnMetro() throws IOException {
        switchScene("CheckBalanceScene.fxml", "CheckBalanceController");
    }

    // Handler for "Exit Metro Station"
    @FXML
    public void ExitMetroStation() throws IOException {
        switchScene("ExitStationScene.fxml", "ExitStationController");
    }

    // Handler for "Enter Metro Station"
    @FXML
    public void EnterMetroStation() throws IOException {
        switchScene("EnterStationScene.fxml", "EnterStationController");
    }

    // Method to switch scenes
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

