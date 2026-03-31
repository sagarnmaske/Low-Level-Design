package interThreadCommunication;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceCustomLock {

    private boolean isItemPresent = false;

    private ReentrantLock lock;

    public SharedResourceCustomLock(ReentrantLock lock) {
        this.lock = lock;
    }

    public synchronized void produceItem() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " Acquired Lock");
            Thread.sleep(5000);
            isItemPresent = true;
        } catch (InterruptedException e) {
            System.out.println("T1 Interrupted");
        } finally {
            System.out.println(Thread.currentThread().getName() + " Released Lock");
            lock.unlock();
        }
    }

    public void consumeItem() {
        try {

            lock.lock();
            System.out.println(Thread.currentThread().getName() + " Acquired Lock");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("T2 Interrupted");
        } finally {
            System.out.println(Thread.currentThread().getName() + "  Released Lock");
            lock.unlock();
        }

    }
}
