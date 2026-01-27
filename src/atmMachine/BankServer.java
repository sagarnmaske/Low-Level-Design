package atmMachine;

import java.util.HashMap;
import java.util.Map;

public class BankServer {
    Map<ATMCard, ATMCardDetails> cardDetailsMap;

    public BankServer() {
        cardDetailsMap = new HashMap<>();
    }

    public void addCard(ATMCard atmCard, Integer pin, Long accountBalance) {
        cardDetailsMap.put(atmCard, new ATMCardDetails(pin, accountBalance));
    }

    public boolean isValidCard(ATMCard card) {
        return cardDetailsMap.containsKey(card);
    }

    public boolean validatePin(ATMCard card, Integer pin) {
        return cardDetailsMap.get(card).getPin().equals(pin);
    }

    public Long getBalance(ATMCard card) {
        return cardDetailsMap.get(card).getAccountBalance();
    }

    public void addBalance(ATMCard card, Long balance) {
        ATMCardDetails currAtmCardDetails = cardDetailsMap.get(card);
        currAtmCardDetails.setAccountBalance(currAtmCardDetails.getAccountBalance() + balance);
        cardDetailsMap.put(card, currAtmCardDetails);
    }

    public boolean hasSufficientBalance(ATMCard card, Long balance) {
        return cardDetailsMap.get(card).getAccountBalance() >= balance;
    }

    public void withdrawBalance(ATMCard card, Long balance) {
        ATMCardDetails currAtmCardDetails = cardDetailsMap.get(card);
        currAtmCardDetails.setAccountBalance(currAtmCardDetails.getAccountBalance() - balance);
        cardDetailsMap.put(card, currAtmCardDetails);
    }
}
