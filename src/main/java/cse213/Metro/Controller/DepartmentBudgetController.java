package cse213.Metro.Controller;

import cse213.Metro.User_01.DepartmentBudget;
import cse213.Metro.User_01.FinancialManager;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class DepartmentBudgetController
{
    @javafx.fxml.FXML
    private Label CurrentBudgetLabel;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentNAmeComboBox;
    @javafx.fxml.FXML
    private TextField EnternewBudgetTypeTextField;
    @javafx.fxml.FXML
    private TextField EnternewBudgetAmountTextField1;
    @javafx.fxml.FXML
    private TableColumn<DepartmentBudget,String> BudgetTypeColumn;
    @javafx.fxml.FXML
    private TableView<DepartmentBudget> tableview;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private TableColumn<DepartmentBudget,String> DepartmentNamecolumn;
    @javafx.fxml.FXML
    private TableColumn<DepartmentBudget,LocalDate> datecolumn;
    @javafx.fxml.FXML
    private TableColumn<DepartmentBudget,Double> AmountColumn;





    @javafx.fxml.FXML
    public void initialize() {
        // private String departmentName;
        //    private double amount;
        //    private String budgetType;
        //    private LocalDate date;
        double currentBudget=DepartmentBudget.calculateCurrentBudget();
        CurrentBudgetLabel.setText(String.format("%.2f",currentBudget));





        DepartmentNAmeComboBox.getItems().addAll("Operations Department", "Maintenance Department", "Marketing and Public Relations", "Infrastructure Department", "Customer Service Department", "Revenue Management", "Safety and Security Department", "Executive Management");
        DepartmentNamecolumn.setCellValueFactory(new PropertyValueFactory<>("departmentName"));
        BudgetTypeColumn.setCellValueFactory(new PropertyValueFactory<>("budgetType"));
        AmountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));


    }

    @javafx.fxml.FXML
    public void BackToHomeButtonOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cse213/Metro/login.fxml")); // Adjust as needed
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Error loading the next screen.");
            alert.show();
        }
    }

    @javafx.fxml.FXML
    public void ShowTheRecordButtonOnAction(ActionEvent actionEvent) {
        try {
            DepartmentBudget budget = new DepartmentBudget();
            ObservableList<DepartmentBudget> budgetList = budget.fileread();
            tableview.setItems(budgetList);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Records Loaded Successfully");
            alert.show();
        }
        catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setContentText("Error loading the next screen."+e.getMessage());
           alert.show();


        }












    }

    @javafx.fxml.FXML
    public void AddTheRequestButtonOnAction(ActionEvent actionEvent) {
        if(DepartmentNAmeComboBox.getValue()==null || EnternewBudgetAmountTextField1.getText().isEmpty() || EnternewBudgetTypeTextField.getText().isEmpty()  ) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter all the fields correctly.");
            alert.show();
            return;

        }
        if (datepicker.getValue() == null || !datepicker.getValue().isEqual(LocalDate.now())){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter the date correctly.");
            alert.show();
            return;

        }

        try {
            File file = new File("DepartmentBudgetData.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos); // Skip writing the header
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos); // Write the header
            }

            if (oos instanceof AppendableObjectOutputStream) {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("Skipped writing duplicate File Header.");
                a.show();
            } else {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("File Header will be written.");
                a.show();
            }


            DepartmentBudget record = new DepartmentBudget(
                    //String departmentName, double amount, String budgetType, LocalDate date
                    DepartmentNAmeComboBox.getValue(),
                    Double.parseDouble(EnternewBudgetAmountTextField1.getText()),
                    EnternewBudgetTypeTextField.getText(),

                    datepicker.getValue()
            );


            oos.writeObject(record);
            oos.close();

            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setContentText("Records saved successfully!");
            successAlert.show();

        } catch (Exception e) {
            e.printStackTrace();
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Error saving the record: " + e.getMessage());
            errorAlert.show();
        }
    }



    }
