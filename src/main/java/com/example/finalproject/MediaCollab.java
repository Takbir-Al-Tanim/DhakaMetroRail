package com.example.finalproject;

import java.io.Serializable;

public class MediaCollab implements Serializable {
    private String PartnerName,Objectives,Resource;
    private int Budget;




    public MediaCollab(String partnerName, String objectives, String resource, int budget) {
        PartnerName = partnerName;
        Objectives = objectives;
        Resource = resource;
        Budget = budget;
    }

    public String getPartnerName() {
        return PartnerName;
    }

    public void setPartnerName(String partnerName) {
        PartnerName = partnerName;
    }

    public String getObjectives() {
        return Objectives;
    }

    public void setObjectives(String objectives) {
        Objectives = objectives;
    }

    public String getResource() {
        return Resource;
    }

    public void setResource(String resource) {
        Resource = resource;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
    }

    @Override
    public String toString() {
        return "MediaCollab{" +
                "PartnerName='" + PartnerName + '\'' +
                ", Objectives='" + Objectives + '\'' +
                ", Resource='" + Resource + '\'' +
                ", Budget=" + Budget +
                '}';
    }
}
