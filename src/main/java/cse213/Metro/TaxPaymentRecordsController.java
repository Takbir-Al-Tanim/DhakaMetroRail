package cse213.Metro;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TaxPaymentRecordsController
{
    @javafx.fxml.FXML
    private TableColumn taxratecolumn;
    @javafx.fxml.FXML
    private TableColumn taxtypecolumn;
    @javafx.fxml.FXML
    private TableView TaxRecordsTableView;
    @javafx.fxml.FXML
    private TableColumn taxamountcolumn;
    @javafx.fxml.FXML
    private TableColumn paymentmethodcolumn;
    @javafx.fxml.FXML
    private DatePicker dateOfRecordsDatePicker;
    @javafx.fxml.FXML
    private TableColumn datecolumn;
    @javafx.fxml.FXML
    private TableColumn transactionidcolumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ShowTaxPaymentRecordOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToHomeOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveRecordOnAction(ActionEvent actionEvent) {
    }
}