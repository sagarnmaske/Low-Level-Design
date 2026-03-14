package adapterDesignPattern;

public class NumberAcceptor {
    BinaryToDecimalConvertor binaryToDecimalConvertor;

    public NumberAcceptor(BinaryToDecimalConvertor binaryToDecimalConvertor) {
        this.binaryToDecimalConvertor = binaryToDecimalConvertor;
    }

    public void accept() {
        System.out.println(binaryToDecimalConvertor.convertBinaryToDecimal());
    }
}
