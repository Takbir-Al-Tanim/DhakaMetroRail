public class CancelTicketScene {

    private String ticketCardNumber;
    private int refundAmount;
    private String confirmationMessage;

    public CancelTicketScene() {
        this.refundAmount = 0;
    }

    public CancelTicketScene(String ticketCardNumber, int refundAmount, String confirmationMessage) {
        this.ticketCardNumber = ticketCardNumber;
        this.refundAmount = refundAmount;
        this.confirmationMessage = confirmationMessage;
    }

    public String getTicketCardNumber() {
        return ticketCardNumber;
    }

    public void setTicketCardNumber(String ticketCardNumber) {
        this.ticketCardNumber = ticketCardNumber;
    }

    public int getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(int refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getConfirmationMessage() {
        return confirmationMessage;
    }

    public void setConfirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }

    @Override
    public String toString() {
        return "CancelTicketScene{" +
                "ticketCardNumber='" + ticketCardNumber + '\'' +
                ", refundAmount=" + refundAmount +
                ", confirmationMessage='" + confirmationMessage + '\'' +
                '}';
    }
}
