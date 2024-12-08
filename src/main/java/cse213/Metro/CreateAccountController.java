package cse213.Metro;

import cse213.Metro.User_01.FinancialManager;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountController
{
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



    private List<User> users = new ArrayList<>();
    @javafx.fxml.FXML
    private Label OutputL;


    @javafx.fxml.FXML
    public void initialize() {
        UserComboBox.getItems().addAll("Financial Manager","Train Operator");
    }

    @javafx.fxml.FXML
    public void CreateAccountOnAction(ActionEvent actionEvent) {
        String name, password, phoneNumber, email,user;
        name = NameTextField.getText();
        password = PasswordTF.getText();
        phoneNumber = PhoneNumberTextField.getText();
        email = EmailTextField.getText();
        user = UserComboBox.getValue();
        FinancialManager financialManager=new FinancialManager(name,password,phoneNumber,email,user);
        OutputL.setText(financialManager.toString());
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Create Account");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to create a new account?");
        alert.showAndWait();


    }
}