package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IncreaseAudienceController implements Serializable
{

    @javafx.fxml.FXML
    private ComboBox<String> audienceComboBox;
    @javafx.fxml.FXML
    private TextField ObjectiveField;
    @javafx.fxml.FXML
    private TextField budgetField1;
    @javafx.fxml.FXML
    private DatePicker datepicker;

    @javafx.fxml.FXML
    public void initialize() {

        audienceComboBox.getItems().addAll("kids","Tenegger","Adult");

    }

    @javafx.fxml.FXML
    public void SaveUsingObjectStreambutton(ActionEvent actionEvent) {
        try{
            File f=new File("IncraseAudienceList.bin");
            FileOutputStream fos=null;
            ObjectOutputStream oos=null;
            if(f.exists()){
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutputStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);

            }
            
            //if(ObjectiveField.getText().isEmpty())  || audienceComboBox.getValue()==null || budgetField1.getText().isEmpty() {}

           /* if (ObjectiveField.getText().isEmpty()) || audienceComboBox.getValue() == null || budgetField1.getText().isEmpty() || datepicker.getValue() == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("All fields must be filled out.");
                alert.show();
                return;
            }*/
              if (ObjectiveField.getText().isEmpty() || audienceComboBox.getValue()==null || budgetField1.getText().isEmpty()||datepicker.getValue() == null){

                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setTitle("Error");
                  alert.show();
                  return;

            }
              //Write the object to the file

            oos.writeObject(
                    new increaseAudience(
                            ObjectiveField.getText(),
                            audienceComboBox.getValue(),
                            Integer.parseInt(budgetField1.getText()),



                                    //datepicker.getText()
                                    //datepicker.getValue()



                            datepicker.getValue().toString()

                    )

            );
            oos.close();



        }
        catch(Exception e){
            e.printStackTrace();
        }



    }
}