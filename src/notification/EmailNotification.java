package notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser(User user, Event event) {
        user.receiveNotification(event);
    }
}
