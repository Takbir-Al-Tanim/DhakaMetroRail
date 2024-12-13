public class RechargeCardModel {

    private String metroCardNumber;
    private String rechargeAmount;
    private String paymentMethod;
    private String accountNumber;
    private String password;
    private String confirmationMessage;

    public RechargeCardModel() {
        this.metroCardNumber = "";
        this.rechargeAmount = "";
        this.paymentMethod = "";
        this.accountNumber = "";
        this.password = "";
        this.confirmationMessage = "";
    }

    public RechargeCardModel(String metroCardNumber, String rechargeAmount, String paymentMethod,
                             String accountNumber, String password, String confirmationMessage) {
        this.metroCardNumber = metroCardNumber;
        this.rechargeAmount = rechargeAmount;
        this.paymentMethod = paymentMethod;
        this.accountNumber = accountNumber;
        this.password = password;
        this.confirmationMessage = confirmationMessage;
    }

    public String getMetroCardNumber() {
        return metroCardNumber;
    }

    public void setMetroCardNumber(String metroCardNumber) {
        this.metroCardNumber = metroCardNumber;
    }

    public String getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(String rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmationMessage() {
        return confirmationMessage;
    }

    public void setConfirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }

    @Override
    public String toString() {
        return "RechargeCardModel{" +
                "metroCardNumber='" + metroCardNumber + '\'' +
                ", rechargeAmount='" + rechargeAmount + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", confirmationMessage='" + confirmationMessage + '\'' +
                '}';
    }
}

