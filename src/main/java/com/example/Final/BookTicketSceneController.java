package com.example.Final;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BookTicketSceneController {

    @FXML
    private ComboBox<String> departureComboBox;
    @FXML
    private ComboBox<String> destinationComboBox;
    @FXML
    private TableView<Train> trainTableView;
    @FXML
    private TableColumn<Train, String> trainNameColumn;
    @FXML
    private TableColumn<Train, String> trainTimeColumn;
    @FXML
    private TableColumn<Train, Double> trainFareColumn;
    @FXML
    private TextField ticketCountField;
    @FXML
    private Label priceLabel;

    private final ObservableList<Train> availableTrains = FXCollections.observableArrayList();

    public void initialize() {
        departureComboBox.setItems(FXCollections.observableArrayList("Station A", "Station B", "Station C"));
        destinationComboBox.setItems(FXCollections.observableArrayList("Station D", "Station E", "Station F"));

        trainNameColumn.setCellValueFactory(new PropertyValueFactory<>("trainName"));
        trainTimeColumn.setCellValueFactory(new PropertyValueFactory<>("trainTime"));
        trainFareColumn.setCellValueFactory(new PropertyValueFactory<>("fare"));
    }

    @FXML
    private void searchTrains(ActionEvent event) {
        availableTrains.clear();
        availableTrains.add(new Train("Train 1", "10:00 AM", 50.0));
        availableTrains.add(new Train("Train 2", "12:00 PM", 60.0));
        availableTrains.add(new Train("Train 3", "2:00 PM", 70.0));

        trainTableView.setItems(availableTrains);
    }

    FXML
    private void proceedPayment(ActionEvent event) {
        try {
            int ticketCount = Integer.parseInt(ticketCountField.getText());
            Train selectedTrain = trainTableView.getSelectionModel().getSelectedItem();

            if (selectedTrain == null) {
                priceLabel.setText("Please select a train.");
                return;
            }
            double totalPrice = ticketCount * selectedTrain.getFare();
            priceLabel.setText("Total Price: $" + totalPrice);

            System.out.println("Payment of $" + totalPrice + " processed.");
            System.out.println("Enjoy your journey!");
        } catch (NumberFormatException e) {
            priceLabel.setText("Invalid ticket count.");
        }
    }
}
