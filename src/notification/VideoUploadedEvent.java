package notification;

public class VideoUploadedEvent extends Event {
    public VideoUploadedEvent(int id, String title, String description, long timestamp) {
        super(id, title, description, timestamp);
    }
}
