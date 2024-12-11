package cse213.Metro.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class PayrollController
{
    @javafx.fxml.FXML
    private TextField EmployeeIdTextFeild;
    @javafx.fxml.FXML
    private DatePicker paymentDateDatePicker;
    @javafx.fxml.FXML
    private Label PayroolAmountTextField;
    @javafx.fxml.FXML
    private TableColumn employeeIdColumn;
    @javafx.fxml.FXML
    private TextField BonusesTextField;
    @javafx.fxml.FXML
    private TableColumn paymentDateColumn;
    @javafx.fxml.FXML
    private TableColumn payrollStatusColumn;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private TextField DeductionTextField;
    @javafx.fxml.FXML
    private TextField HoursWorkedTextField;
    @javafx.fxml.FXML
    private TableColumn amountcolumn;
    @javafx.fxml.FXML
    private TableView Tableview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackToHomeOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ProceedThePayrolltOnAction(ActionEvent actionEvent) {
    }
}