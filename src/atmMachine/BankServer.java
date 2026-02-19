package atmMachine;

import java.util.HashMap;
import java.util.Map;

public class BankServer {
    Map<ATMCard, ATMCardDetails> cardDetailsMap;

    public BankServer() {
        cardDetailsMap = new HashMap<>();
    }

    public void addCard(ATMCard atmCard, int pin, int accountBalance) {
        cardDetailsMap.put(atmCard, new ATMCardDetails(pin, accountBalance));
    }

    public boolean isValidCard(ATMCard card) {
        return cardDetailsMap.containsKey(card);
    }

    public boolean validatePin(ATMCard card, int pin) {
        return cardDetailsMap.get(card).getPin().equals(pin);
    }

    public int getBalance(ATMCard card) {
        return cardDetailsMap.get(card).getAccountBalance();
    }

    public void addBalance(ATMCard card, int balance) {
        ATMCardDetails currAtmCardDetails = cardDetailsMap.get(card);
        currAtmCardDetails.setAccountBalance(currAtmCardDetails.getAccountBalance() + balance);
        cardDetailsMap.put(card, currAtmCardDetails);
    }

    public boolean hasSufficientBalance(ATMCard card, int balance) {
        return cardDetailsMap.get(card).getAccountBalance() >= balance;
    }

    public void withdrawBalance(ATMCard card, int balance) {
        ATMCardDetails currAtmCardDetails = cardDetailsMap.get(card);
        currAtmCardDetails.setAccountBalance(currAtmCardDetails.getAccountBalance() - balance);
        cardDetailsMap.put(card, currAtmCardDetails);
    }
}
