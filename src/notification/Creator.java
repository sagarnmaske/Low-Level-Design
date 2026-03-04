package notification;

public class Creator {
    int creatorId;
    Event event;

    public Creator(int creatorID, Event event) {
        this.creatorId = creatorID;
        this.event = event;
    }

    public void uploadVideo(int videoID) {
        System.out.println("Video Uploaded");
        event.addEvent(this.creatorId + " Just posted new video:"+videoID);
    }

}
