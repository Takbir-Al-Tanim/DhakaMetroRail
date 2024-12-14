package com.example.finalproject;

import java.io.Serializable;
import java.time.LocalDate;

public class increaseAudience implements Serializable {

    private String Objective;
    private String Audience;
    private int Budget;
    private String Date;


    public increaseAudience(String objective, String audience, int budget, String date) {
        Objective = objective;
        Audience = audience;
        Budget = budget;
        Date = date;
    }

    public String getObjective() {
        return Objective;
    }

    public void setObjective(String objective) {
        Objective = objective;
    }

    public String getAudience() {
        return Audience;
    }

    public void setAudience(String audience) {
        Audience = audience;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "increaseAudience{" +
                "Objective='" + Objective + '\'' +
                ", Audience='" + Audience + '\'' +
                ", Budget=" + Budget +
                ", Date='" + Date + '\'' +
                '}';
    }
}
