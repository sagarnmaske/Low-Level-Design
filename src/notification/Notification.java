package notification;

public class Notification {
    Event event;
    String modeOfReceiving;

    public Notification(Event event, String modeOfReceiving) {
        this.event = event;
        this.modeOfReceiving = modeOfReceiving;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "event=" + event +
                ", modeOfReceiving='" + modeOfReceiving + '\'' +
                '}';
    }
}
