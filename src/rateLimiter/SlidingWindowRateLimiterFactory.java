package rateLimiter;

public class SlidingWindowRateLimiterFactory implements RateLimiterFactory {
    @Override
    public RateLimiter createRateLimiter(long maxWindowTime, int maxRequestInWindow) {
        return new SlidingWindowRateLimiter(maxWindowTime, maxRequestInWindow);
    }
}
