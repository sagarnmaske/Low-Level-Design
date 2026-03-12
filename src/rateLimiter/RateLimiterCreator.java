package rateLimiter;

public class RateLimiterCreator {

    public static volatile RateLimiter rateLimiter = null;

    private RateLimiterCreator() {
    }

    public static RateLimiter createRateLimiter(long maxWindowTime, int maxRequestInWindow) {
        if (rateLimiter == null) {
            synchronized (RateLimiterCreator.class) {
                if (rateLimiter == null) {
                    RateLimiterFactory rateLimiterFactory = new FixedWindowRateLimiterFactory();
                    rateLimiter = rateLimiterFactory.createRateLimiter(maxWindowTime, maxRequestInWindow);
                }
            }
        }
        return rateLimiter;
    }
}
