package cse213.Metro.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TrainConditionController
{
    @javafx.fxml.FXML
    private TableColumn CheckedPartsColumn;
    @javafx.fxml.FXML
    private CheckBox engineCheckBox;
    @javafx.fxml.FXML
    private CheckBox lightcheckbox;
    @javafx.fxml.FXML
    private CheckBox FireAlarm;
    @javafx.fxml.FXML
    private CheckBox AcCheckBox;
    @javafx.fxml.FXML
    private CheckBox Brakecheckbox;
    @javafx.fxml.FXML
    private TableView ConditionTableView;
    @javafx.fxml.FXML
    private TableColumn NoncheckedPartsColumn;
    @javafx.fxml.FXML
    private CheckBox gatecheckbox;
    @javafx.fxml.FXML
    private TableColumn datecolumn;
    @javafx.fxml.FXML
    private DatePicker datepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backhomeOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UbdateTheReportOnAction(ActionEvent actionEvent) {
    }
}