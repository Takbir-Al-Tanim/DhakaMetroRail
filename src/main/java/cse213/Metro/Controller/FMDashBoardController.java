package cse213.Metro.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FMDashBoardController {
    @javafx.fxml.FXML
    private AnchorPane side_anchorpane;
    @javafx.fxml.FXML
    private Button button;
    @javafx.fxml.FXML
    private Button button4;
    @javafx.fxml.FXML
    private Button button5;
    @javafx.fxml.FXML
    private Button button2;
    @javafx.fxml.FXML
    private Button button3;
    @javafx.fxml.FXML
    private Button button6;
    @javafx.fxml.FXML
    private Button button7;
    @javafx.fxml.FXML
    private Button button1;
    @javafx.fxml.FXML
    private BorderPane dashboardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void SignoutbuttonOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cse213/Metro/login.fxml")); // Adjust as needed
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Error loading the next screen.");
            alert.showAndWait();
        }

    }

    @javafx.fxml.FXML
    public void TaxPaymentbuttonOnAction(ActionEvent actionEvent) {
        loadUI("/cse213/Metro/TaxPayment.fxml");
    }

    @javafx.fxml.FXML
    public void TaxReprtbuttonOnAction(ActionEvent actionEvent) {
        loadUI("/cse213/Metro/TaxPaymentRecords.fxml");
    }

    @javafx.fxml.FXML
    public void DepartmentBudgetbuttonOnAction(ActionEvent actionEvent) {
        loadUI("/cse213/Metro/DepartmentBudget.fxml");
    }

    @javafx.fxml.FXML
    public void TicketSalesAnalysisbuttonOnAction(ActionEvent actionEvent) {
        loadUI("/cse213/Metro/MonthlySalesReport.fxml");
    }

    @javafx.fxml.FXML
    public void VendorPaymentbuttonOnAction(ActionEvent actionEvent) {
        loadUI("/cse213/Metro/VendorPayment.fxml");
    }

    @javafx.fxml.FXML
    public void PayrollbuttonOnAction(ActionEvent actionEvent) {
        loadUI("/cse213/Metro/Payroll.fxml");
    }

    @javafx.fxml.FXML
    public void DailyTransactionbuttonOnAction(ActionEvent actionEvent) throws IOException {
        loadUI("/cse213/Metro/DailyTransaction.fxml");

    }

    private void loadUI(String fxmlFileName) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFileName));

            Node node = fxmlLoader.load();

            dashboardBorderPane.setCenter(node);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}