public class TrainScheduleModel {

    private String trainName;
    private String trainTime;
    private String trainDuration;

    public TrainScheduleModel() {
        this.trainName = "";
        this.trainTime = "";
        this.trainDuration = "";
    }

    public TrainScheduleModel(String trainName, String trainTime, String trainDuration) {
        this.trainName = trainName;
        this.trainTime = trainTime;
        this.trainDuration = trainDuration;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(String trainTime) {
        this.trainTime = trainTime;
    }

    public String getTrainDuration() {
        return trainDuration;
    }

    public void setTrainDuration(String trainDuration) {
        this.trainDuration = trainDuration;
    }

    @Override
    public String toString() {
        return "TrainScheduleModel{" +
                "trainName='" + trainName + '\'' +
                ", trainTime='" + trainTime + '\'' +
                ", trainDuration='" + trainDuration + '\'' +
                '}';
    }
}
