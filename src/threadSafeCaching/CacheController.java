package threadSafeCaching;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheController {

    public void controlCaching() {
        ThreadSafeCache<Integer> threadSafeCache = new ThreadSafeCache<>();
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        Runnable t1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadSafeCache.get(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable t2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadSafeCache.get(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable t3 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadSafeCache.get(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.shutdown();
    }
}
