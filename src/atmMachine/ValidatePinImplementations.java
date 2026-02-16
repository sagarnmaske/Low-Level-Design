package atmMachine;

public class ValidatePinImplementations extends ValidatePin {
    BankServer bankServer;

    public ValidatePinImplementations(BankServer bankServer) {
        this.bankServer = bankServer;
    }

    @Override
    public boolean isValidCard(ATMCard atmCard) {
        return bankServer.isValidCard(atmCard);
    }

    @Override
    public boolean isValidPinLength(int pin) {
        return String.valueOf(pin).length() == 4;
    }

    @Override
    public boolean isEqualPin(ATMCard atmCard, int pin) {
        return bankServer.validatePin(atmCard, pin);
    }
}
