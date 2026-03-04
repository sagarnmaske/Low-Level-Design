package notification;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser(User user, String message) {
        user.receiveNotification("Received SMS notification:" + message);
    }
}
