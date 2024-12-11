package cse213.Metro.User_01;


import cse213.Metro.User;

import java.util.ArrayList;



public class FinancialManager extends User {
    private String name;
    //-name: String
    //-employeeID: String {unique}
    //-role: String]
    //-email: String
    //-loginStatus: Boolean
    private String employeeID;
    private String type;
    private String email;



    public FinancialManager( String name, String password, String email, String phoneNumber,String type) {
        super(name, password, email, phoneNumber,type);
        this.type = type;


    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "FinancialManager{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
