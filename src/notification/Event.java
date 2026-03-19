package notification;

public class Event {
    int id;
    String title;
    String description;
    long timestamp;

    public Event(int id, String title, String description, long timestamp) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
