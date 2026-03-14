package adapterDesignPattern;

public class ConvertBinaryToDecimal implements BinaryToDecimalConvertor {
    NumberProvider numberProvider;

    public ConvertBinaryToDecimal(NumberProvider numberProvider) {
        this.numberProvider = numberProvider;
    }

    public int convertBinaryToDecimal() {
        return Integer.parseInt(numberProvider.provideNumber(), 2);
    }
}
