package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class UpdateController implements Serializable
{
    @javafx.fxml.FXML
    private TableView<ServiceUpdate> updateFile;
    @javafx.fxml.FXML
    private ComboBox<String> purposeComboBox;
    @javafx.fxml.FXML
    private TableColumn<ServiceUpdate,String> purposeCol;
    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentComboBox;
    @javafx.fxml.FXML
    private TableColumn<ServiceUpdate,String> DeptCol;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TableColumn<ServiceUpdate,String> DateCol;
    @javafx.fxml.FXML
    private TableColumn<ServiceUpdate,String> NameCol;
    ArrayList<ServiceUpdate> UpdateList;

    @javafx.fxml.FXML
    public void initialize(URL url, ResourceBundle rb) {

        UpdateList=new ArrayList<ServiceUpdate>();

        purposeComboBox.getItems().addAll("Policy Update", "Achievement Announcement", "Event Notification");
        DepartmentComboBox.getItems().addAll("HR", "IT", "Finance", "Operations");

        // Set up TableView columns
        purposeCol.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        DeptCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        DateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        NameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
    }



    @javafx.fxml.FXML
    public void SaveOnClickOnAction(ActionEvent actionEvent) {


        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("UpdateList.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }



            //oos.writeObject(new ServiceUpdate(purposeComboBox.getValue(),DepartmentComboBox.getValue(),
              //      NameTextField.getText(), DatePicker.getValue().toString())



            );

            ServiceUpdate update = new ServiceUpdate(
                    purposeComboBox.getValue(),
                    DepartmentComboBox.getValue(),
                    NameTextField.getText(),
                    DatePicker.getValue().toString()
            );

            oos.writeObject(update);

            oos.close();


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }




    @javafx.fxml.FXML
    public void LoadOnAction(ActionEvent actionEvent) {

        ObjectInputStream ois = null;
        try{
            ServiceUpdate i;
            ois = new ObjectInputStream(new FileInputStream("UpdateList.bin"));
            while(true){
                i = (ServiceUpdate) ois.readObject();
                System.out.println(i);
                updateFile.getItems().add(i);
            }
        }
        catch(Exception e){
            try{
                if(ois != null)
                    ois.close();
            }
            catch(IOException x){
                x.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}