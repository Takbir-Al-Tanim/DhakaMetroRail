
public class CapacityManagementModel {

    private String operatorId;
    private String password;
    private String trainOccupancy;
    private String stationCrowd;
    private String expectedImprovement;

    public CapacityManagementModel() {}

    public CapacityManagementModel(String operatorId, String password, String trainOccupancy, String stationCrowd, String expectedImprovement) {
        this.operatorId = operatorId;
        this.password = password;
        this.trainOccupancy = trainOccupancy;
        this.stationCrowd = stationCrowd;
        this.expectedImprovement = expectedImprovement;
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

    public String getTrainOccupancy() {
        return trainOccupancy;
    }

    public void setTrainOccupancy(String trainOccupancy) {
        this.trainOccupancy = trainOccupancy;
    }

    public String getStationCrowd() {
        return stationCrowd;
    }

    public void setStationCrowd(String stationCrowd) {
        this.stationCrowd = stationCrowd;
    }

    public String getExpectedImprovement() {
        return expectedImprovement;
    }

    public void setExpectedImprovement(String expectedImprovement) {
        this.expectedImprovement = expectedImprovement;
    }

    @Override
    public String toString() {
        return "CapacityManagementModel{" +
                "operatorId='" + operatorId + '\'' +
                ", password='" + password + '\'' +
                ", trainOccupancy='" + trainOccupancy + '\'' +
                ", stationCrowd='" + stationCrowd + '\'' +
                ", expectedImprovement='" + expectedImprovement + '\'' +
                '}';
    }
}
