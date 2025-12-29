package equalandHashcode;

public class MoneyDriverController {
    public void createImmutableClass(){
        Money money = new Money(100);
        System.out.println(money.getMoney());
    }
}
