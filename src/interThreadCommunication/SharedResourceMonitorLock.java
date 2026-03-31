package interThreadCommunication;

public class SharedResourceMonitorLock {

    private boolean isItemPresent = false;

    public synchronized void produceItem() {
        try {
            System.out.println("T1 Acquired Lock");
            Thread.sleep(5000);
            isItemPresent = true;
            System.out.println("T1 Released Lock");
            wait();
        } catch (InterruptedException e) {
            System.out.println("T1 Interrupted");
        }
    }

    public void consumeItem() {
        try {
            Thread.sleep(5000);
            synchronized (this) {
                System.out.println("T2 Acquired Thread");
                while (!isItemPresent) {
                    isItemPresent = false;
                }
                notify();
            }
            System.out.println("T2 Released Lock Thread");
        } catch (InterruptedException e) {
            System.out.println("T2 Interrupted");
        }
    }
}
