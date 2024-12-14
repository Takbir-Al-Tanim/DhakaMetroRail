import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CustomerExperienceController {

    @FXML
    private TextField userIdField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Label loginStatusLabel;
    @FXML
    private Button menuButton;
    @FXML
    private TextField feedbackTextField;
    @FXML
    private Button submitFeedbackButton;
    @FXML
    private Label thankYouMessage;

    @FXML
    public void handleLogin() {
        String userId = userIdField.getText();
        String password = passwordField.getText();

        if (validateLogin(userId, password)) {
            loginStatusLabel.setText("Successfully logged in!");
            menuButton.setDisable(false);  // Enable the menu button
        } else {
            loginStatusLabel.setText("Invalid User ID or Password.");
        }
    }

    @FXML
    public void handleMenu() {
        feedbackTextField.setVisible(true);
        submitFeedbackButton.setVisible(true);
    }

    @FXML
    public void handleSubmitFeedback() {
        String feedback = feedbackTextField.getText();

        if (feedback != null && !feedback.trim().isEmpty()) {
            thankYouMessage.setText("Thanks for your feedback! Always stay with us.");
            feedbackTextField.setText("");
        } else {
            thankYouMessage.setText("Please write something before submitting.");
        }
    }

    private boolean validateLogin(String userId, String password) {
        return userId.equals("user123") && password.equals("password123");
    }
}

