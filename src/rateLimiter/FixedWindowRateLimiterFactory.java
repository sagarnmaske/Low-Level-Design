package rateLimiter;

public class FixedWindowRateLimiterFactory implements RateLimiterFactory {
    @Override
    public RateLimiter createRateLimiter(long maxWindowTime, int maxRequestInWindow) {
        return new FixedWindowRateLimiter(maxWindowTime, maxRequestInWindow);
    }
}
