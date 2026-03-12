package rateLimiter;

public interface RateLimiter {
    boolean handleRequest(String client);
}
