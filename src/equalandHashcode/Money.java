package equalandHashcode;

public final class Money {
    private final int money;
    public Money(int m){
        this.money = m;
    }

    public int getMoney(){
       return this.money;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj instanceof Money money1){
            return this.money==money1.money;
        }

        return false;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(money);
    }
}
