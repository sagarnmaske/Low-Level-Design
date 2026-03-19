package notification;

public class YTVideoCreator extends Publisher {
    int creatorId;

    public YTVideoCreator(int creatorID, EventsQueue eventsQueue) {
        super(eventsQueue);
        this.creatorId = creatorID;
    }

    public void uploadVideo(int eventId) {
        publishEvent(new VideoUploadedEvent(eventId, creatorId + ":uploaded Video",
                "Hey Guys your favourite creator uploaded new video",
                System.currentTimeMillis()));
    }

    @Override
    void publishEvent(Event event) {
        eventsQueue.addEvent(event);
    }
}
