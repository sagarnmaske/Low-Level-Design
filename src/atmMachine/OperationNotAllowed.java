package atmMachine;

public class OperationNotAllowed extends RuntimeException {
    public OperationNotAllowed(Exception e) {
        super(e.getMessage());
    }
}
