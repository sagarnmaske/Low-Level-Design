package atmMachine;


public interface MoneyProcessingChain {

    boolean withdrawMoney(Money money, int amount);

    void depositMoney(Money money);
}
