package executorService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelTaskController {
    public void parallelTask() {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture<String> s5 = CompletableFuture.supplyAsync(()->{
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sb.append(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return sb.toString();
        });

        Future<String> s2 = executor.submit(() -> {
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sb.append(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return sb.toString();
        });
        Future<String> s4 = executor.submit(() -> {
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sb.append(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return sb.toString();
        });
        Future<String> s3 = executor.submit(() -> {
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sb.append(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return sb.toString();
        });

        try{
//            System.out.println(s2.get());
//            System.out.println(s3.get());
//            System.out.println(s4.get());
            System.out.println(s5.get());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        executor.shutdown();
    }
}
