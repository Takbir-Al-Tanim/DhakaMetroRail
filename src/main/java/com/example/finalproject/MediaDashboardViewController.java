package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;



public class MediaDashboardViewController
{
    @javafx.fxml.FXML
    private Button button;
    @javafx.fxml.FXML
    private Button button4;
    @javafx.fxml.FXML
    private Button button5;
    @javafx.fxml.FXML
    private Button button2;
    @javafx.fxml.FXML
    private Button button3;
    @javafx.fxml.FXML
    private Button button6;
    @javafx.fxml.FXML
    private Button button7;
    @javafx.fxml.FXML
    private Button button1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AudienceReachbuttonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MediaDirectorr/AudienceReach/increaseAudience.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage=(Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);



    }

    @javafx.fxml.FXML
    public void MediaCamgainbuttonOnAction(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void CollaborationsbuttonOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MediaDirectorr/Collaborations/Collaborations.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage=(Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void BudgetViewbuttonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MediaDirectorr/BudgetManagement/BudgetView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage=(Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }

    @javafx.fxml.FXML
    public void MediaTrendsbuttonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ServiceUpdatebuttonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RespondToInquiresbuttonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CrisisCombuttonOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MediaDirectorr/CrisisCommunication/CrisisCommunicationView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage=(Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}