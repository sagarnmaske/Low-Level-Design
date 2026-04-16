package interThreadCommunication;

public class Counter {
    int count;
    int turn;
    int total;

    public Counter() {
        count = 0;
        turn = 0;
        total = 15;
    }

    public void printNumber() {
        while (true) {
            try {
                synchronized (Counter.class) {
                    if(count > total){
                        Counter.class.notifyAll();
                        return;
                    }
                    while (!Thread.currentThread().getName().equals(String.valueOf(turn % 3))) {
                        Counter.class.wait();
                        if (count > total) {
                            Counter.class.notifyAll();
                            return;
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;
                    turn = (turn + 1) % 3;
                    Counter.class.notifyAll();
                }

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
