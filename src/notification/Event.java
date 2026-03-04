package notification;

import java.util.LinkedList;
import java.util.Queue;

public class Event {
    Queue<String> queue;

    public Event() {
        queue = new LinkedList<>();
    }

    public void addEvent(String event) {
        queue.add(event);
    }
}
