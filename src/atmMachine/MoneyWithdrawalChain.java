package atmMachine;


public interface MoneyWithdrawalChain {
    boolean withdrawMoney(Money money, int amount);

    void depositMoney(Money money);
}
