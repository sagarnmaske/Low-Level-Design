package atmMachine;

public class OperationNotAllowed extends RuntimeException {
    public OperationNotAllowed() {
        super("Operation not allowed");
    }
}
