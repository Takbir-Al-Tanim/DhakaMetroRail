public class OperationsProgress {

    private String operatorId;
    private String password;
    private boolean isLoggedIn;
    private String trainSchedule;
    private String passengerLoad;
    private String realTimeUpdates;
    private String trainFrequency;
    private String feedback;

    public OperationsProgress(String operatorId, String password, boolean isLoggedIn,
                              String trainSchedule, String passengerLoad, String realTimeUpdates,
                              String trainFrequency, String feedback) {
        this.operatorId = operatorId;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
        this.trainSchedule = trainSchedule;
        this.passengerLoad = passengerLoad;
        this.realTimeUpdates = realTimeUpdates;
        this.trainFrequency = trainFrequency;
        this.feedback = feedback;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public String getTrainSchedule() {
        return trainSchedule;
    }

    public void setTrainSchedule(String trainSchedule) {
        this.trainSchedule = trainSchedule;
    }

    public String getPassengerLoad() {
        return passengerLoad;
    }

    public void setPassengerLoad(String passengerLoad) {
        this.passengerLoad = passengerLoad;
    }

    public String getRealTimeUpdates() {
        return realTimeUpdates;
    }

    public void setRealTimeUpdates(String realTimeUpdates) {
        this.realTimeUpdates = realTimeUpdates;
    }

    public String getTrainFrequency() {
        return trainFrequency;
    }

    public void setTrainFrequency(String trainFrequency) {
        this.trainFrequency = trainFrequency;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "OperationsProgress{" +
                "operatorId='" + operatorId + '\'' +
                ", password='" + password + '\'' +
                ", isLoggedIn=" + isLoggedIn +
                ", trainSchedule='" + trainSchedule + '\'' +
                ", passengerLoad='" + passengerLoad + '\'' +
                ", realTimeUpdates='" + realTimeUpdates + '\'' +
                ", trainFrequency='" + trainFrequency + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}