package atmMachine;

public final class ATMCard {
    private String atmNumber;
    private String cardHolderName;
    private String expiryDate;
    private Integer cvv;

    public ATMCard(String atmNumber, String cardHolderName,
                   String expiryDate, Integer cvv) {
        this.atmNumber = atmNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "ATMCard{" +
                "atmNumber='" + atmNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv=" + cvv +
                '}';
    }
}
