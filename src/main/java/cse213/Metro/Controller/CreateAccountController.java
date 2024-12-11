package cse213.Metro.Controller;

import cse213.Metro.User;
import cse213.Metro.User_01.FinancialManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class CreateAccountController {
    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private TextField PasswordTF;
    @javafx.fxml.FXML
    private TextField PhoneNumberTextField;
    @javafx.fxml.FXML
    private ComboBox<String> UserComboBox;
    @javafx.fxml.FXML
    private TextField EmailTextField;
    @javafx.fxml.FXML
    private Label OutputL;


    private ArrayList<User> users;

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    @javafx.fxml.FXML
    //name, password, email, phoneNumber, userType
    public void initialize() {
        //users=new ArrayList<User>();
    //    users.add("Tanim","1234","0175030","Financial Manger");

        UserComboBox.getItems().addAll("Financial Manager", "Train Operator");
    }

    @javafx.fxml.FXML
    public void CreateAccountOnAction(ActionEvent actionEvent) {
        String name = NameTextField.getText();
        String password = PasswordTF.getText();
        String phoneNumber = PhoneNumberTextField.getText();
        String email = EmailTextField.getText();
        String userType = UserComboBox.getValue();


        if (name.isEmpty() || password.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() || userType == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Error");
            alert.setContentText("Please fill in all fields and select a user type.");
            alert.showAndWait();
            return;
        }


        User newUser;
        if ("Financial Manager".equals(userType)) {
            newUser = new FinancialManager(name, password, email, phoneNumber, userType);
        }
        /*else if ("Train Operator".equals(userType)) {
            newUser = new TrainOperator(name, password, email, phoneNumber, userType);

         */

        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Invalid user type selected.");
            alert.showAndWait();
            return;
        }


        String generatedId = newUser.generateId(userType);
        newUser.setId(generatedId);
        users.add(newUser);
        OutputL.setText(newUser.toString());


        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Account Created");
        alert.setHeaderText("Account successfully created!");
        alert.setContentText("Generated ID: " + generatedId + "\nPassword: " + newUser.getPassword());
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void BackToLoginOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(fxmlLoader.load());


            loginController loginController = fxmlLoader.getController();
            loginController.setUsers(users);


            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Unable to return to login screen.");
            alert.showAndWait();
        }
    }
}
