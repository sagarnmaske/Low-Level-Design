package threadSafeCaching;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeCache<K> {
     ConcurrentHashMap<K, String> cache;

    public ThreadSafeCache() {
        cache = new ConcurrentHashMap<>();
    }

    public String get(K key) {
        cache.computeIfAbsent(key, k -> {
            System.out.println("Data Not Present in the cache fetching from DB for "+ key);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return System.currentTimeMillis() + "";
        });
        return cache.get(key);
    }

}
