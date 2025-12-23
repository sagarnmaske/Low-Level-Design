package notification;

public class NotificationManager {
    private Notification notification;
    public NotificationManager(Notification notification){
        this.notification = notification;
    }

    public void tellSecret(){
        notification.notifyUser();
    }
}
