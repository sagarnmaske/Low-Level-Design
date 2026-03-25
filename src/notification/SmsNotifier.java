package notification;

public class SmsNotifier implements Notifier {
    @Override
    public void notifyUser(User user, Notification notification) {
        user.receiveNotification(notification);
    }
}
