package cse213.Metro;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class FMDashBoardController {
    @javafx.fxml.FXML
    private AnchorPane side_anchorpane;
    @javafx.fxml.FXML
    private HBox DepartmentBudget;
    @javafx.fxml.FXML
    private Button button;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void DepartmentBudgetOnAction(Event event) {
    }

    @javafx.fxml.FXML
    public void DepartmentBudgetOnMouseClicked(Event event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Budget.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage=(Stage)(((Node) event.getSource()).getScene().getWindow());
            stage.setScene(scene);
            stage.show();
        }




    @javafx.fxml.FXML
    public void buttobOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Budget.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage=(Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }
}