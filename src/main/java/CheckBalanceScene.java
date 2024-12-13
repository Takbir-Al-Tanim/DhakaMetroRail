public class CheckBalanceScene {

    private String metroCardNumber;
    private int currentBalance;

    public CheckBalanceScene() {
        this.metroCardNumber = "";
        this.currentBalance = 0;
    }

    public CheckBalanceScene(String metroCardNumber, int currentBalance) {
        this.metroCardNumber = metroCardNumber;
        this.currentBalance = currentBalance;
    }

    public String getMetroCardNumber() {
        return metroCardNumber;
    }

    public void setMetroCardNumber(String metroCardNumber) {
        this.metroCardNumber = metroCardNumber;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "CheckBalanceScene{" +
                "metroCardNumber='" + metroCardNumber + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }
}
