package cse213.Metro;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Budget
{
    @javafx.fxml.FXML
    private Label CurrentBudgetLabel;
    @javafx.fxml.FXML
    private TableView ExpenseTableView;
    @javafx.fxml.FXML
    private TableColumn StatusColumn;
    @javafx.fxml.FXML
    private TableColumn ExpenseTypeColumn;
    @javafx.fxml.FXML
    private TextField EnternewBudgetTextField;
    @javafx.fxml.FXML
    private TableColumn AmountColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToHomeButtonOnAction(ActionEvent actionEvent) {
    }
}