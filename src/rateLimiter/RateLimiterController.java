package rateLimiter;

public class RateLimiterController {

    public void controlRateLimiter() {
        RateLimiter rateLimiter = RateLimiterCreator.createRateLimiter(5000, 3);
        Client client = new Client();
        client.sendRequest(rateLimiter);
    }
}
