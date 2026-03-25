package notification;

public class EmailNotifier implements Notifier {
    @Override
    public void notifyUser(User user, Notification notification) {
        user.receiveNotification(notification);
    }
}
