package adapterDesignPattern;

public class NumberSystemController {

    public static void control() {
        NumberProvider numberProvider = new NumberProvider();
        BinaryToDecimalConvertor binaryToDecimalConvertor = new ConvertBinaryToDecimal(numberProvider);
        NumberAcceptor numberAcceptor = new NumberAcceptor(binaryToDecimalConvertor);
        numberAcceptor.accept();
    }
}
