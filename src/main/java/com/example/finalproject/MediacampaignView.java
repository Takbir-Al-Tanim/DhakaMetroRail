package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class MediacampaignView implements Serializable {

    @FXML
    private ComboBox<String> PlatformComboBox;
    @FXML
    private TextField BudgetTextFiled;
    @FXML
    private TextField ReachTextField;
    @FXML
    private ComboBox<String> ContentComboBox;
    @FXML
    private TextField CampaignTextFiled;
    @FXML
    private TextArea Console;

    @FXML
    public void initialize() {
        // Populate the combo boxes with platform and content options
        PlatformComboBox.getItems().addAll("Instagram", "Facebook", "Twitter", "Print Media");
        ContentComboBox.getItems().addAll("Reel", "Shorts", "Stories", "Ad");
    }

    @FXML
    public void ReadFileButtonOnAction(ActionEvent actionEvent) {
        String fileLocation = "mediaCampaign.txt";
        File file = new File(fileLocation);

        // Check if the file exists
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                Console.clear(); // Clear the console before displaying new data
                while (scanner.hasNextLine()) {
                    Console.appendText(scanner.nextLine() + "\n");
                }
            } catch (IOException e) {
                Console.appendText("Error reading the file: " + e.getMessage() + "\n");
                e.printStackTrace();
            }
        } else {
            Console.appendText("File doesn't exist...!\n");
        }
    }
}
