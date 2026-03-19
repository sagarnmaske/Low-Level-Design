package notification;

public class EventConsumer {

    EventsQueue eventsQueue;
    NotificationSender sender;

    public EventConsumer(EventsQueue eventsQueue, NotificationSender sender) {
        this.eventsQueue = eventsQueue;
        this.sender = sender;
    }

    public void consumeEvent() {
        if (eventsQueue.queue.isEmpty()) {
            System.out.println("No events in queue");
            return;
        }
        while (!eventsQueue.queue.isEmpty()) {
            Event e = eventsQueue.queue.poll();
            sender.sendNotification(e);
        }
    }
}
