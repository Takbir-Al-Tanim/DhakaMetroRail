public class ExitMetroStationModel {

    private String metroCardNumber;
    private int fareDeducted;
    private int updatedBalance;
    private String statusMessage;

    public ExitMetroStationModel() {
        this.metroCardNumber = "";
        this.fareDeducted = 0;
        this.updatedBalance = 0;
        this.statusMessage = "";
    }

    public ExitMetroStationModel(String metroCardNumber, int fareDeducted, int updatedBalance, String statusMessage) {
        this.metroCardNumber = metroCardNumber;
        this.fareDeducted = fareDeducted;
        this.updatedBalance = updatedBalance;
        this.statusMessage = statusMessage;
    }

    public String getMetroCardNumber() {
        return metroCardNumber;
    }

    public void setMetroCardNumber(String metroCardNumber) {
        this.metroCardNumber = metroCardNumber;
    }

    public int getFareDeducted() {
        return fareDeducted;
    }

    public void setFareDeducted(int fareDeducted) {
        this.fareDeducted = fareDeducted;
    }

    public int getUpdatedBalance() {
        return updatedBalance;
    }

    public void setUpdatedBalance(int updatedBalance) {
        this.updatedBalance = updatedBalance;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return "ExitMetroStationModel{" +
                "metroCardNumber='" + metroCardNumber + '\'' +
                ", fareDeducted=" + fareDeducted +
                ", updatedBalance=" + updatedBalance +
                ", statusMessage='" + statusMessage + '\'' +
                '}';
    }
}
