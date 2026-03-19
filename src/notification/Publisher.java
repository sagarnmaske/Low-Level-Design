package notification;

public abstract class Publisher {
    EventsQueue eventsQueue;

    public Publisher(EventsQueue eventsQueue) {
        this.eventsQueue = eventsQueue;
    }

    abstract void publishEvent(Event event);
}
