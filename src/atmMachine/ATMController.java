package atmMachine;

import java.util.Scanner;

public class ATMController {
    public void controlAtm() {
        try {
            ATMCard atmCard1 = new ATMCard("125633", "Sagar", "12/26", 128);
            ATMCard atmCard2 = new ATMCard("1354", "Arsu", "1/29", 129);
            BankServer bankServer = BankServerInitializer.initializeServer(atmCard1, atmCard2);
            InventoryManager inventoryManager = InventoryInitializer.initializeInventoryManager();
            MoneyProcessingChain moneyProcessingChain = MoneyProcessingChainInitializer.initialize(inventoryManager);
            ATM atm = new ATM(new ATMStateIdleState(), bankServer, inventoryManager, 123,
                    "Dhotri Tuljapur Dharashiv", "SNM Bank",
                    moneyProcessingChain);
            System.out.println(inventoryManager.totalAvailableNotes());
            atm.greeting();
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter 1: To Accept Card 1");
                System.out.println("Enter 2: To Accept Card 2");
                int ch = input.nextInt();
                if (ch == 1) {
                    atm.acceptCard(atmCard1);
                    System.out.println(atmCard1);
                    System.out.println("Card 1 Accepted");
                } else if (ch == 2) {
                    atm.acceptCard(atmCard2);
                    System.out.println(atmCard2);
                    System.out.println("Card 2 Accepted");
                } else {
                    System.out.println("Wrong input");
                    break;
                }
                System.out.println("Enter Pin To Proceed");
                int pin = input.nextInt();
                if (!atm.validatePin(pin)) {
                    System.out.println("Invalid Pin");
                } else {
                    System.out.println("Select Choice To Perform Operation");
                    System.out.println("1.Check Balance");
                    System.out.println("2.Deposit Cash");
                    System.out.println("3.Withdraw Balance");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        atm.checkBalance();
                    } else if (choice == 2) {
                        System.out.println("Enter Amount to Deposit");
                        int amount = input.nextInt();
                        atm.depositCash(amount);
                    } else {
                        System.out.println("Enter Amount to Withdraw");
                        int amount = input.nextInt();
                        Money money = atm.withdrawCash(amount);
                        System.out.println(inventoryManager.totalAvailableNotes());
                        System.out.println(money);
                        atm.collectCash();
                    }
                }
                System.out.println("Wish to perform more operations press 1");
                int ch1 = input.nextInt();
                if (ch1 != 1) {
                    break;
                }
                //   atm = new ATM(new ATMStateIdleState(), bankServer);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error In the ATM");
        }
    }

}
