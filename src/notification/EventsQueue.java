package notification;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class EventsQueue {
    BlockingQueue<Event> queue;

    public EventsQueue() {
        queue = new LinkedBlockingQueue<>();
    }

    public void addEvent(Event event) {
        queue.add(event);
    }

    public Event takeEvent() throws InterruptedException {
        return queue.take();
    }
}
