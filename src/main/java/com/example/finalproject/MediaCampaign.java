package com.example.finalproject;

import java.io.Serializable;

public class MediaCampaign implements Serializable {

    private String PlatFormName;
    private String CampaignName;
    private String ContentType;
    private int BudgetAllocated;
    private int Reach;

    public MediaCampaign(String platFormName, String campaignName, String contentType, int budgetAllocated, int reach) {
        PlatFormName = platFormName;
        CampaignName = campaignName;
        ContentType = contentType;
        BudgetAllocated = budgetAllocated;
        Reach = reach;
    }

    public String getPlatFormName() {
        return PlatFormName;
    }

    public void setPlatFormName(String platFormName) {
        PlatFormName = platFormName;
    }

    public String getCampaignName() {
        return CampaignName;
    }

    public void setCampaignName(String campaignName) {
        CampaignName = campaignName;
    }

    public String getContentType() {
        return ContentType;
    }

    public void setContentType(String contentType) {
        ContentType = contentType;
    }

    public int getBudgetAllocated() {
        return BudgetAllocated;
    }

    public void setBudgetAllocated(int budgetAllocated) {
        BudgetAllocated = budgetAllocated;
    }

    public int getReach() {
        return Reach;
    }

    public void setReach(int reach) {
        Reach = reach;
    }

    @Override
    public String toString() {
        return "MediaCampaign{" +
                "PlatFormName='" + PlatFormName + '\'' +
                ", CampaignName='" + CampaignName + '\'' +
                ", ContentType='" + ContentType + '\'' +
                ", BudgetAllocated=" + BudgetAllocated +
                ", Reach=" + Reach +
                '}';
    }
}
