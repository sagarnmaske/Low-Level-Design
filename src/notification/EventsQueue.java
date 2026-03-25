package notification;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class EventsQueue {
    BlockingQueue<Event> queue;

    private final Object lock = new Object();

    public EventsQueue() {
        queue = new LinkedBlockingQueue<>();
    }

    public void addEvent(Event event) {
        synchronized (lock) {
            queue.add(event);
        }
    }

    public List<Event> takeEvent() {
        List<Event> events = new ArrayList<>();
        if (!queue.isEmpty()) {
            synchronized (lock) {
                if (!queue.isEmpty()) {
                    System.out.println("Queue Size: " + queue.size());
                    events = queue.stream().toList();
                    queue.clear();
                }
            }
        }

        return events;
    }
}
