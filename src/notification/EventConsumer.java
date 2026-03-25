package notification;

import java.util.ArrayList;
import java.util.List;

public class EventConsumer {

    EventsQueue eventsQueue;
    NotificationSender sender;

    public EventConsumer(EventsQueue eventsQueue, NotificationSender sender) {
        this.eventsQueue = eventsQueue;
        this.sender = sender;
    }

    public void consumeEvent() {
        List<Event> events = eventsQueue.takeEvent();
        if (events.isEmpty()) {
            System.out.println("No events in queue");
            return;
        }
        for (Event event : events) {
            sender.sendNotification(event);
        }

    }
}
