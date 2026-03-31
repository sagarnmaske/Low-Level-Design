package interThreadCommunication;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadController {

    public void threadController() {
        //       SharedResourceMonitorLock sharedResourceMonitorLock = new SharedResourceMonitorLock();
//        Thread t1 = new Thread(() -> {
//            sharedResourceMonitorLock.produceItem();
//        });
//
//        Thread t2 = new Thread(() -> {
//            sharedResourceMonitorLock.consumeItem();
//        });
//
//        t1.start();
//        t2.start();

        ReentrantLock lock = new ReentrantLock();

        SharedResourceCustomLock sharedResourceCustomLock = new SharedResourceCustomLock(lock);
        Thread t1 = new Thread(() -> {
            sharedResourceCustomLock.produceItem();
        });

        Thread t2 = new Thread(() -> {
            sharedResourceCustomLock.consumeItem();
        });

        SharedResourceCustomLock sharedResourceMonitorLock2 = new SharedResourceCustomLock(lock);
        Thread t3 = new Thread(() -> {
            sharedResourceMonitorLock2.produceItem();
        });

        Thread t4 = new Thread(() -> {
            sharedResourceMonitorLock2.consumeItem();
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("Main Thread Finished Working");
    }

}
