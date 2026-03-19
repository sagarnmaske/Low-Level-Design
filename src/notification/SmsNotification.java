package notification;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser(User user, Event event) {
        user.receiveNotification(event);
    }
}
