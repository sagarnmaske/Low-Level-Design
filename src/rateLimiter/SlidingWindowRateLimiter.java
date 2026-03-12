package rateLimiter;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public final class SlidingWindowRateLimiter implements RateLimiter {
    long maxWindowTime;
    int maxRequestInWindow;
    Map<String, Queue<Long>> requestStartsMap;

    SlidingWindowRateLimiter(long maxWindowTime, int maxRequestInWindow) {
        this.maxWindowTime = maxWindowTime;
        this.maxRequestInWindow = maxRequestInWindow;
        requestStartsMap = new ConcurrentHashMap<>();
    }

    @Override
    public synchronized boolean handleRequest(String client) {
        long currentTime = System.currentTimeMillis();
        requestStartsMap.putIfAbsent(client, new LinkedList<>());
        Queue<Long> window = requestStartsMap.get(client);
        while (!window.isEmpty() && window.peek() <= currentTime - maxWindowTime) {
            window.poll();
        }
        if (window.size() < maxRequestInWindow) {
            window.offer(currentTime);
            return true;
        }
        return false;
    }

}
