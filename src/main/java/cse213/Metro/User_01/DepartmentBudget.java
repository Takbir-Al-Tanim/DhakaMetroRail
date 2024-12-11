package cse213.Metro.User_01;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class DepartmentBudget implements Serializable {
    private String departmentName;
    private double amount;
    private String budgetType;
    private LocalDate date;

    public DepartmentBudget() {
    }

    public DepartmentBudget(String departmentName, double amount, String budgetType, LocalDate date) {
        this.departmentName = departmentName;
        this.amount = amount;
        this.budgetType = budgetType;
        this.date = date;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DepartmentBudget{" +
                "departmentName='" + departmentName + '\'' +
                ", amount=" + amount +
                ", budgetType='" + budgetType + '\'' +
                ", date=" + date +
                '}';
    }


    public static ObservableList<DepartmentBudget> fileread() {
        ObservableList<DepartmentBudget> budgetList = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        f = new File("DepartmentBudgetData.bin");
        if(!f.exists()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("No recordsfound.File does not exist");
            alert.show();
        }
        try {


            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            DepartmentBudget budget;
            while (true) {
                try {
                    budget = (DepartmentBudget) ois.readObject();
                    budgetList.add(budget);
                } catch (EOFException e) {
                    break;
                }
                catch (ClassNotFoundException e){
                    e.printStackTrace();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error to read file.");
            alert.show();


        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return budgetList;
    }
    public static double calculateCurrentBudget(){
        double totalBudget = 0;

        try{
            DepartmentBudget budget=new DepartmentBudget();

            ObservableList<DepartmentBudget> budgetList =budget.fileread();
            for(DepartmentBudget record :budgetList) {
                totalBudget+=record.getAmount();



            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return totalBudget;

    }



}
