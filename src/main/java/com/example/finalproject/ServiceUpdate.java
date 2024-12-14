package com.example.finalproject;

import java.io.Serializable;

public class ServiceUpdate implements Serializable {
    private String purpose;
    private String Department;
    private String Name;
    private String date;

    public ServiceUpdate(String purpose, String department, String name, String date) {
        this.purpose = purpose;
        Department = department;
        Name = name;
        this.date = date;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ServiceUpdate{" +
                "purpose='" + purpose + '\'' +
                ", Department='" + Department + '\'' +
                ", Name='" + Name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
