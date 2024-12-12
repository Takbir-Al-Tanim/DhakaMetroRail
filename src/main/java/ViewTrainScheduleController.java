import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.ActionEvent;

public class ViewTrainScheduleController {
    @javafx.fxml.FXML
    private ComboBox destinationComboBox;
    @javafx.fxml.FXML
    private TableColumn trainTimeColumn;
    @javafx.fxml.FXML
    private TableView trainScheduleTable;
    @javafx.fxml.FXML
    private TableColumn trainNameColumn;
    @javafx.fxml.FXML
    private ComboBox departureComboBox;
    @javafx.fxml.FXML
    private TableColumn trainDurationColumn;
    @javafx.fxml.FXML
    private Button viewScheduleButton;

    @javafx.fxml.FXML
    public void viewTrainSchedule(ActionEvent actionEvent) {
    }
}
