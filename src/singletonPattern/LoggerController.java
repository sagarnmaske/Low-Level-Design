package singletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoggerController {

    public void checkInstances() {
        Logger first = Logger.getInstance();
        LogsAccumulator logsAccumulator = new LogsAccumulator();
        ErrorLogProducer errorLogProducer = new ErrorLogProducer(logsAccumulator);
        WarnLogProducer warnLogProducer = new WarnLogProducer(logsAccumulator);
        InfoLogProducer infoLogProducer = new InfoLogProducer(logsAccumulator);
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    errorLogProducer.produceLogs(Thread.currentThread().getName());
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    infoLogProducer.produceLogs(Thread.currentThread().getName());
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        });

        Thread t3 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    warnLogProducer.produceLogs(Thread.currentThread().getName());
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        });

        Thread t4 = new Thread(() -> {
            try {
                int count = 0;
                while (true) {
                    if(logsAccumulator.logs.isEmpty()){
                        continue;
                    }
                    String s = logsAccumulator.logs.poll();
                    first.logMessage(s);
                    Thread.sleep(500);
                    count++;
                    if(count >= 50){
                        break;
                    }
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        executor.execute(t1);
        executor.execute(t2);
        executor.execute(t3);
        executor.execute(t4);
        executor.shutdown();
    }
}
