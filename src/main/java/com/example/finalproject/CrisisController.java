
package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;

public class CrisisController implements Serializable
{
    @javafx.fxml.FXML
    private ComboBox<String> stationNumberComboBox;
    @javafx.fxml.FXML
    private ToggleGroup tg;
    @javafx.fxml.FXML
    private ComboBox<String> CrisisComboBox;
    @javafx.fxml.FXML
    private RadioButton level2RadiButton;
    @javafx.fxml.FXML
    private RadioButton Level1RadioButton;

    @javafx.fxml.FXML
    public void initialize() {

        stationNumberComboBox.getItems().addAll("Station 1","Station 2","Station 3","Station 4","Station 5","Station 6");
        CrisisComboBox.getItems().addAll("Fire","Flood","EarthQuake","Power Outage");
        tg = new ToggleGroup();
        Level1RadioButton.setToggleGroup(tg);
        level2RadiButton.setToggleGroup(tg);

    }

    @javafx.fxml.FXML
    public void AddButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NextButtonOnAction(ActionEvent actionEvent) throws IOException {




/*
        try{
            FXMLLoader myFxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource("CrisisReport.fxml")
            );



            Scene nextScene = new Scene(myFxmlLoader.load());
            Stage newStage = new Stage();
            newStage.setScene(nextScene);
            newStage.show();

            /*

            //CrisisReportController nextController = myFxmlLoader.getController();
            //extController.reciveDataFromOtherController(crisisTextFiled.getText());

            /*CrisisReportController nextController = myFxmlLoader.getController();

            String selectedStation = stationNumberComboBox.getValue();
            String selectedCrisis = CrisisComboBox.getValue();
            RadioButton selectedLevel = (RadioButton) tg.getSelectedToggle();

            // Pass data to the next controller
            nextController.receiveDataFromOtherController(selectedCrisis, selectedStation, selectedLevel.getText()) ;

        }
        catch(Exception e){



    }
}