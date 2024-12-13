package com.example.finalproject;

import java.io.Serializable;
import java.time.LocalDate;

public class CrisisCommunication implements Serializable {

    private String crisis;
    private String level;
    private String StationNumber;
    private boolean  channel;
    private LocalDate date;


    public CrisisCommunication(String level, String crisis, String stationNumber, boolean channel, LocalDate date) {
        this.level = level;
        this.crisis = crisis;
        StationNumber = stationNumber;
        this.channel = channel;
        this.date = date;
    }

    public String getCrisis() {
        return crisis;
    }

    public void setCrisis(String crisis) {
        this.crisis = crisis;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStationNumber() {
        return StationNumber;
    }

    public void setStationNumber(String stationNumber) {
        StationNumber = stationNumber;
    }

    public boolean isChannel() {
        return channel;
    }

    public void setChannel(boolean channel) {
        this.channel = channel;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "CrisisCommunication{" +
                "crisis='" + crisis + '\'' +
                ", level='" + level + '\'' +
                ", StationNumber='" + StationNumber + '\'' +
                ", channel=" + channel +
                ", date=" + date +
                '}';
    }
}
