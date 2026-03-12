package rateLimiter;

public interface RateLimiterFactory {
    RateLimiter createRateLimiter(long maxWindowTime, int maxRequestInWindow);
}
