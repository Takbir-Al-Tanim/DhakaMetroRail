import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardControllerCE {

    @FXML
    private Button customerExperienceButton;
    @FXML
    private Button leadershipButton;
    @FXML
    private Button operationButton;
    @FXML
    private Button simulationButton;
    @FXML
    private Button trainUtilizationButton;
    @FXML
    private Button emergencySimulationButton;
    @FXML
    private Button costAnalysisButton;
    @FXML
    private Button energyReductionButton;

    @FXML
    public void handleCustomerExperience() {
        switchScene("CustomerExperience.fxml","CustomerExperienceController");
    }

    private void switchScene(String customerExperience, String customerExperienceController) {
    }

    @FXML
    public void handleLeadership() {
        switchScene("Leadership.fxml","LeadershipController");
    }

    @FXML
    public void handleOperation() {
        switchScene("Operation");
    }

    @FXML
    public void handleSimulation() {
        switchScene("Simulation");
    }

    @FXML
    public void handleTrainUtilization() {
        switchScene("TrainUtilization");
    }

    @FXML
    public void handleEmergencySimulation() {
        switchScene("EmergencySimulation");
    }

    @FXML
    public void handleCostAnalysis() {
        switchScene("CostAnalysis");
    }

    @FXML
    public void handleEnergyReduction() {
        switchScene("EnergyReduction");
    }

    private void switchScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile + ".fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) customerExperienceButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            showError("Error loading the scene: " + e.getMessage());
        }
    }

    private void showError(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("An error occurred");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
