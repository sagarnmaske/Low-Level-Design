package interThreadCommunication;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadController {

    public void threadController() {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            counter.printNumber();
        });
        Thread t2 = new Thread(() -> {
            counter.printNumber();
        });
        Thread t3 = new Thread(() -> {
            counter.printNumber();
        });
        t1.setName("0");
        t2.setName("1");
        t3.setName("2");
        t1.start();
        t2.start();
        t3.start();
    }

}
