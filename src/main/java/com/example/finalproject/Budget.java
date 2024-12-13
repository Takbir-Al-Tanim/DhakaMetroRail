package com.example.finalproject;

import java.io.Serializable;

public class Budget implements Serializable {
    private int TotalBudget,AllocatedBudget,SpendingBudget;
    private String channel;

    public Budget() {
    }

    public Budget(int totalBudget, int allocatedBudget, int spendingBudget, String channel) {
        TotalBudget = totalBudget;
        AllocatedBudget = allocatedBudget;
        SpendingBudget = spendingBudget;
        this.channel = channel;
    }

    public int getTotalBudget() {
        return TotalBudget;
    }

    public void setTotalBudget(int totalBudget) {
        TotalBudget = totalBudget;
    }

    public int getAllocatedBudget() {
        return AllocatedBudget;
    }

    public void setAllocatedBudget(int allocatedBudget) {
        AllocatedBudget = allocatedBudget;
    }

    public int getSpendingBudget() {
        return SpendingBudget;
    }

    public void setSpendingBudget(int spendingBudget) {
        SpendingBudget = spendingBudget;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "TotalBudget=" + TotalBudget +
                 "AllocatedBudget=" + AllocatedBudget +
                ", SpendingBudget=" + SpendingBudget +
                ", channel='" + channel + '\'' +
                '}';
    }
}

