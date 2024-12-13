package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BudgetViewController implements Serializable {
    @javafx.fxml.FXML
    private TextField totalBudgetField;
    @javafx.fxml.FXML
    private TableColumn<Budget, Integer> allocatedBudgetCol;
    @javafx.fxml.FXML
    private ComboBox<String> AllocatedBudgetComboBox;
    @javafx.fxml.FXML
    private TableColumn<Budget, Integer> spendingCol;
    @javafx.fxml.FXML
    private TextField SpendingBudgetField;
    @javafx.fxml.FXML
    private TableColumn<Budget, String> ChannelCol;
    @javafx.fxml.FXML
    private ComboBox<String> mediaChannelComboBox;
    @javafx.fxml.FXML
    private TableView<Budget> BudgetViewTable;

    ArrayList<Budget> BudgetList;
    @javafx.fxml.FXML
    private TextArea console ;


    @javafx.fxml.FXML
    public void initialize() {
        BudgetList = new ArrayList<Budget>();
        allocatedBudgetCol.setCellValueFactory(new PropertyValueFactory<>("AllocatedBudget"));
        spendingCol.setCellValueFactory(new PropertyValueFactory<>("SpendingBudget"));
        ChannelCol.setCellValueFactory(new PropertyValueFactory<>("channel"));

        mediaChannelComboBox.getItems().addAll("Social media", "TV", "Radio", "online Ads");
        AllocatedBudgetComboBox.getItems().addAll("15000", "26000", "20000", "5000", "10000");


    }


    @javafx.fxml.FXML
    public void SaveOnClickAction(ActionEvent actionEvent) {

        Budget B = new Budget(Integer.parseInt(totalBudgetField.getText()),
                Integer.parseInt(SpendingBudgetField.getText()),
                Integer.parseInt(AllocatedBudgetComboBox.getValue()),
                mediaChannelComboBox.getValue());


        BudgetViewTable.getItems().add(B);
        totalBudgetField.clear();
        SpendingBudgetField.clear();
        mediaChannelComboBox.getSelectionModel().clearSelection();

    }

    @javafx.fxml.FXML
    public void writeObjectButtonOnAction(ActionEvent actionEvent) {

        File file = new File("BudgetData.Bin");
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {


            for (Budget budget : BudgetViewTable.getItems()) {
                oos.writeObject(budget);
            }
            System.out.println("All data saved to BudgetData.Bin");

        } catch (IOException ex) {
            Logger.getLogger(BudgetViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        totalBudgetField.clear();
        SpendingBudgetField.clear();
        mediaChannelComboBox.getSelectionModel().clearSelection();
        AllocatedBudgetComboBox.getSelectionModel().clearSelection();


        /*Budget B = new Budget(Integer.parseInt(totalBudgetField.getText()),
                Integer.parseInt(SpendingBudgetField.getText()),
                Integer.parseInt(AllocatedBudgetComboBox.getValue()),
                mediaChannelComboBox.getValue());
        File f=null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        f=new File("BudgetData.Bin");
        try{
            fos=new FileOutputStream(f);
            oos=new ObjectOutputStream(fos);
            Budget d=new Budget();
            oos.writeObject(d);


        }catch(IOException ex){
            Logger.getLogger(BudgetViewController.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            try{
                if(oos!=null){
                    oos.close();

                }
            }catch(IOException ex){
                Logger.getLogger(BudgetViewController.class.getName()).log(Level.SEVERE, null, ex);

            }
        }*/




    }

    @javafx.fxml.FXML
    public void readObjectOnAction(ActionEvent actionEvent) {


        File f = new File("BudgetData.bin");
        if (!f.exists()) {
            console.appendText("No data file found.\n");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            BudgetViewTable.getItems().clear(); // Clear the TableView before loading
            while (true) {
                try {
                    Budget d = (Budget) ois.readObject();
                    BudgetViewTable.getItems().add(d); // Add to TableView
                    console.appendText(d.toString() + "\n"); // Append to console
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
            System.out.println("Data read successfully.");
        } catch (IOException | ClassNotFoundException e) {
            Logger.getLogger(BudgetViewController.class.getName()).log(Level.SEVERE, null, e);
        }
    }

        /*try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("BudgetData.bin"))){
            while (true){
                try{
                    Budget d=(Budget) ois.readObject();
                    console.appendText(d.toString()+"\n");

                }catch(EOFException e){
                    break;
                }
            }
        }catch(IOException|ClassNotFoundException e){
            e.printStackTrace();
        }


        totalBudgetField.clear();
        SpendingBudgetField.clear();
        mediaChannelComboBox.getSelectionModel().clearSelection();


    }*/
}

       /* File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        f=new File("BudgetData.Bin");

        try{

            fos=new FileOutputStream(f);
            oos=new ObjectOutputStream(fos);
            Budget c=new Budget();
            oos.writeObject(c);



            totalBudgetField.clear();
            SpendingBudgetField.clear();
            mediaChannelComboBox.getSelectionModel().clearSelection();

        }catch(IOException ex) {
            Logger.getLogger(Package.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Package.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

       /* File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        f=new File("BudgetData.Bin");

        try{


            f=new File("BudgetData.Bin");
            fos=new FileOutputStream(f);
            oos=new AppendableObjectOutputStream((fos));

            Budget B= new Budget(Integer.parseInt(totalBudgetField.getText()),
                    Integer.parseInt(SpendingBudgetField.getText()),
                    Integer.parseInt(AllocatedBudgetComboBox.getValue()),
                    mediaChannelComboBox.getValue());

            //System.out.println(B);
            //BudgetViewTable.getItems().add(B);
            for( Budget i: BudgetViewTable.getItems() ){
                oos.writeObject(i.toString("for File"));
            //oos.writeObject(B);





            totalBudgetField.clear();
            SpendingBudgetField.clear();
            mediaChannelComboBox.getSelectionModel().clearSelection();


            fos.close();
            oos.close();





            }catch(FileNotFoundException e){

            throw new RuntimeException(e);

        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
}

        */