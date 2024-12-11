package cse213.Metro.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VendorPaymentController
{
    @javafx.fxml.FXML
    private TextField VendorNameTextFeild;
    @javafx.fxml.FXML
    private TextField PaymentAmountTextFeild;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn VendorNameColumn;
    @javafx.fxml.FXML
    private TableColumn invoiceIdColumn;
    @javafx.fxml.FXML
    private TableColumn DueDatecolumn;
    @javafx.fxml.FXML
    private TextField InvoiceIdTextField;
    @javafx.fxml.FXML
    private TableView VendorPaymentRecords;
    @javafx.fxml.FXML
    private DatePicker PaymentDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackToHomeOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ProceedThePaymentOnAction(ActionEvent actionEvent) {
    }
}