package atmMachine;

public class ATMCardDetails {
    private final Integer pin;
    private int accountBalance;

    public ATMCardDetails(Integer pin, int accountBalance) {
        this.pin = pin;
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public Integer getPin() {
        return pin;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
}
