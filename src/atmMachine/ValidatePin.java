package atmMachine;


public abstract class ValidatePin {

    public final boolean isValidPin(ATMCard atmCard, int pin) {
        if (isValidCard(atmCard) && isValidPinLength(pin) && isEqualPin(atmCard, pin)) {
            System.out.println("Pin valid");
            return true;
        }
        System.out.println("Pin Invalid");
        return false;
    }

    public abstract boolean isValidCard(ATMCard atmCard);

    public abstract boolean isValidPinLength(int pin);

    public abstract boolean isEqualPin(ATMCard atmCard, int pin);

}
