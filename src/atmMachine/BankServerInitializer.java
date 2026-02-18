package atmMachine;

public class BankServerInitializer {
    public static BankServer initializeServer(ATMCard atmCard1, ATMCard atmCard2) {
        BankServer bankServer = new BankServer();
        bankServer.addCard(atmCard1,1234,10000L);
        bankServer.addCard(atmCard2,1235,20000L);
        return bankServer;
    }
}
