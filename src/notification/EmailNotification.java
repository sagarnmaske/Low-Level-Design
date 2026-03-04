package notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser(User user, String message) {
        user.receiveNotification("Received Email notification:" + message);
    }
}
