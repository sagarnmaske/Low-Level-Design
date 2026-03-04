package notification;

public class EventConsumer {

    Event event;
    NotificationSender sender;

    public EventConsumer(Event event, NotificationSender sender) {
        this.event = event;
        this.sender = sender;
    }

    public void consumeEvent() {
        if (event.queue.isEmpty()) {
            System.out.println("No events in queue");
            return;
        }
        while (!event.queue.isEmpty()) {
            String e = event.queue.poll();
            sender.sendNotification(e);
        }
    }
}
