public class EnterMetroStationModel {

    private String metroCardNumber;
    private String statusMessage;

    public EnterMetroStationModel() {
        this.metroCardNumber = "";
        this.statusMessage = "";
    }

    public EnterMetroStationModel(String metroCardNumber, String statusMessage) {
        this.metroCardNumber = metroCardNumber;
        this.statusMessage = statusMessage;
    }

    public String getMetroCardNumber() {
        return metroCardNumber;
    }

    public void setMetroCardNumber(String metroCardNumber) {
        this.metroCardNumber = metroCardNumber;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return "EnterMetroStationModel{" +
                "metroCardNumber='" + metroCardNumber + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                '}';
    }
}
