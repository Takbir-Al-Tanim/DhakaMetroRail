package cse213.Metro.Controller;

import cse213.Metro.User;
import cse213.Metro.User_01.FinancialManager;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class loginController {
    @javafx.fxml.FXML
    private TextField UserIDTextField;
    @javafx.fxml.FXML
    private PasswordField EnterPasswordTextField;

    private ArrayList<User> users = new ArrayList<>();
    @javafx.fxml.FXML
    private ImageView trainImageView;

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    ArrayList<FinancialManager> ArrayList = new ArrayList<>() ;


    @javafx.fxml.FXML
    public void initialize() {
        FinancialManager a = new FinancialManager("Asif", "1234", "2331694@gmail.com", "+8801234567890", "FinancialManager") ;
        users.add(a) ;
       // System.out.println(a);
    }


    @javafx.fxml.FXML
    public void CreateAccountOnAction(ActionEvent actionEvent) {
        try {
          //  FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateAccount.fxml"));
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cse213/Metro/CreateAccount.fxml"));

            Scene scene = new Scene(fxmlLoader.load());

            CreateAccountController createAccountController = fxmlLoader.getController();
            createAccountController.setUsers(users);

            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Unable to navigate to create account screen.");
            alert.showAndWait();
        }
    }

    @javafx.fxml.FXML
    public void LoginOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        String enteredID = UserIDTextField.getText();
        String enteredPassword = EnterPasswordTextField.getText();

        if (enteredID.isEmpty() || enteredPassword.isEmpty()) {
            alert.setContentText("Login Error: User ID or Password cannot be empty.");
            alert.showAndWait();
            return;
        }

        boolean loginSuccessful = false;
        for (User user : users) {
            if (user.loginVR(enteredID, enteredPassword)) {
                loginSuccessful = true;
                alert.setAlertType(Alert.AlertType.INFORMATION);
                alert.setContentText("Login Successful! Welcome, " + user.getName() + ".");
                alert.showAndWait();

                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cse213/Metro/FMDashboard.fxml")); // Adjust as needed
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException exception) {
                    exception.printStackTrace();
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setContentText("Error loading the next screen.");
                    alert.showAndWait();
                }
                break;
            }
        }

        if (!loginSuccessful) {
            alert.setContentText("Login Failed: Invalid User ID or Password.");
            alert.showAndWait();
        }
    }

    @javafx.fxml.FXML
    public void LoginAsPassenger(Event event) {
    }
}
