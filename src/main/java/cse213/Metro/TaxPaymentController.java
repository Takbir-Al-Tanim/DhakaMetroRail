package cse213.Metro;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class TaxPaymentController
{
    @javafx.fxml.FXML
    private ComboBox TaxTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox PaymentMethodCombobox;
    @javafx.fxml.FXML
    private TableView TransactionRecordTableview;
    @javafx.fxml.FXML
    private TableColumn typecolumn;
    @javafx.fxml.FXML
    private TextField SenderAccountNoTextField;
    @javafx.fxml.FXML
    private Label TaxrateLabel;
    @javafx.fxml.FXML
    private TableColumn descriptioncolumn;
    @javafx.fxml.FXML
    private TableColumn paymentmethodcolumn;
    @javafx.fxml.FXML
    private TextField TaxammountTesxtFeild;
    @javafx.fxml.FXML
    private TextField ReceiverAcoountNoTextField;
    @javafx.fxml.FXML
    private TableColumn datecolumn;
    @javafx.fxml.FXML
    private TableColumn amountcolumn;
    @javafx.fxml.FXML
    private DatePicker selectdatepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void PaytheTaxOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToHomeOnAction(ActionEvent actionEvent) {
    }
}