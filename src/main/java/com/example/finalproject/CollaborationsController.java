package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CollaborationsController
{
    @javafx.fxml.FXML
    private TextField BudgetTextField;
    @javafx.fxml.FXML
    private TextField NameField;
    @javafx.fxml.FXML
    private ComboBox<String> resourceComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> objectiveComBox;

    @javafx.fxml.FXML
    public void initialize() {
        //resourceComboBox.getItems().addAll("FinanCial Resources","Human Resources","Technological Resource","Material Resource","Marketing Resources","Logical Resource");
        resourceComboBox.getItems().addAll("financial resource","Human Resources","Technological Resource","Material Resource","Marketing Resources","Logical Resource");



        objectiveComBox.getItems().addAll(
                "Increase Market Share",
                "Enhance Brand Visibility",
                "Conduct Joint Campaigns",
                "Improve Community Engagement",
                "Develop New Products",
                "Address Environmental Issues"
        );

    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        if (NameField.getText().isEmpty() || BudgetTextField.getText().isEmpty() ||
                resourceComboBox.getValue() == null || objectiveComBox.getValue() == null) {
           // showAlert(Alert.AlertType.WARNING, "Input Error", "Please fill all fields before submitting.");
            System.out.println("Error");
           // return;
        }



        try {
            File f = new File("MediaCollaborationObject.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            if (oos instanceof AppendableObjectOutputStream) {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("Skipped writing duplicate File Header.");
                a.showAndWait();
            } else {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("File Header will be written.");
                a.showAndWait();
            }
            oos.writeObject(
                    new MediaCollab(

                           // NameField.getText(),
                            //Integer.parseInt(BudgetTextField.getText()),
                           // BudgetTextField,
                           // resourceComboBox.getValue(),
                            //objectiveComBox.getValue()
                            NameField.getText(),
                            objectiveComBox.getValue(),
                            resourceComboBox.getValue(),// Get the partner name
                            Integer.parseInt(BudgetTextField.getText())
                            //resourceComboBox.getValue()

                    )
            );

            oos.close();
           /* NameField.clear();
            BudgetTextField.clear();
            resourceComboBox.setValue(null);
            objectiveComBox.setValue(null);*/


        }

        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void CollabReaderButtonOnAction(ActionEvent actionEvent) {

            File file = new File("MediaCollaborationObject.bin");

            // Check if the file exists
            if (!file.exists()) {
                System.out.println("No data file found.");
                return;
            }

            try (FileInputStream fis = new FileInputStream(file);
                 ObjectInputStream ois = new ObjectInputStream(fis)) {

                List<MediaCollab> collaborations = new ArrayList<>();
                boolean endOfFile = false;

                while (!endOfFile) {
                    try {
                        // Read objects and cast them to MediaCollab
                        MediaCollab collab = (MediaCollab) ois.readObject();
                        collaborations.add(collab);
                    } catch (Exception e) {
                        // End of file reached
                        endOfFile = true;
                    }
                }

                // Display the read objects
                if (collaborations.isEmpty()) {
                    System.out.println("No collaborations found in the file.");
                } else {
                    System.out.println("Collaborations found:");
                    for (MediaCollab collab : collaborations) {
                        System.out.println(collab);
                    }
                }

            } catch (Exception e) {
                System.out.println("Error reading objects: " + e.getMessage());
                e.printStackTrace();
            }
       // }



    }

        /*String name = NameField.getText();
        String budget = BudgetTextField.getText();
        String selectedResource = resourceComboBox.getValue();
        String selectedObjective = objectiveComBox.getValue();


        if (name.isEmpty() || budget.isEmpty() || selectedResource.isEmpty() || selectedObjective.isEmpty()) {
            System.out.println("Error");

        }
    }

   /* @Deprecated
    public void ConCludeButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void RenewButtonOnAction(ActionEvent actionEvent) {
    }*/
}