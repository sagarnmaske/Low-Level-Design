package atmMachine;

public class ATMCardDetails {
    private final Integer pin;
    private Long accountBalance;

    public ATMCardDetails(Integer pin, Long accountBalance) {
        this.pin = pin;
        this.accountBalance = accountBalance;
    }

    public Long getAccountBalance() {
        return accountBalance;
    }

    public Integer getPin() {
        return pin;
    }

    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }
}
