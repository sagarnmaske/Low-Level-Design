package rateLimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class FixedWindowRateLimiter implements RateLimiter {
    long maxWindowTime;
    int maxRequestInWindow;
    Map<String, Window> requestStartsMap;

    FixedWindowRateLimiter(long maxWindowTime, int maxRequestInWindow) {
        this.maxWindowTime = maxWindowTime;
        this.maxRequestInWindow = maxRequestInWindow;
        requestStartsMap = new ConcurrentHashMap<>();
    }

    @Override
    public synchronized boolean handleRequest(String client) {
        long currentTime = System.currentTimeMillis();
        requestStartsMap.putIfAbsent(client, new Window(currentTime));
        Window window = requestStartsMap.get(client);
        if (window.startTime <= currentTime - maxWindowTime) {
            window.startTime = currentTime;
            window.count = 0;
        }
        if (window.count < maxRequestInWindow) {
            window.count++;
            return true;
        }
        return false;
    }

    public static class Window {
        long startTime;
        int count;

        public Window(long startTime) {
            this.startTime = startTime;
            this.count = 0;
        }
    }
}
