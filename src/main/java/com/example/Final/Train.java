package com.example.Final;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Train {
    private final SimpleStringProperty trainName;
    private final SimpleStringProperty trainTime;
    private final SimpleDoubleProperty trainFare;

    public Train(String trainName, String trainTime, double trainFare) {
        this.trainName = new SimpleStringProperty(trainName);
        this.trainTime = new SimpleStringProperty(trainTime);
        this.trainFare = new SimpleDoubleProperty(trainFare);
    }

    public String getTrainName() {
        return trainName.get();
    }

    public SimpleStringProperty trainNameProperty() {
        return trainName;
    }

    public String getTrainTime() {
        return trainTime.get();
    }

    public SimpleStringProperty trainTimeProperty() {
        return trainTime;
    }

    public double getFare() {
        return trainFare.get();
    }

    public SimpleDoubleProperty trainFareProperty() {
        return trainFare;
    }
}
