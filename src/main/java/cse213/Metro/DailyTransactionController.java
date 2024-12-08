package cse213.Metro;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class DailyTransactionController
{
    @javafx.fxml.FXML
    private TextField transactionAmountTextField;
    @javafx.fxml.FXML
    private TableView transactionTableview;
    @javafx.fxml.FXML
    private ComboBox PaymentmethodChoiceComboBox;
    @javafx.fxml.FXML
    private DatePicker datePickerField;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TextField transactiondescriptionTextField;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private TableColumn paymentMethodColumn;
    @javafx.fxml.FXML
    private TableColumn typeColumn;
    @javafx.fxml.FXML
    private ComboBox transactionTypeChoiceCombo;
    @javafx.fxml.FXML
    private TableColumn descriptionColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveTransactionButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BacktoHomeButtonOnAction(ActionEvent actionEvent) {
    }
}