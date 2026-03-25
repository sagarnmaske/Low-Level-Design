package notification;

import java.util.List;

public class NotificationSender {
    List<User> users;
    Notifier smsNotifier;
    Notifier emailNotifier;

    public NotificationSender(List<User> users,
                              SmsNotifier smsNotification,
                              EmailNotifier emailNotification) {
        this.users = users;
        this.smsNotifier = smsNotification;
        this.emailNotifier = emailNotification;
    }

    public void sendNotification(Event event) {
            for (User user : users) {
                smsNotifier.notifyUser(user, new Notification(event,"SMS"));
            }
            for (User user : users) {
                emailNotifier.notifyUser(user, new  Notification(event,"EMAIL"));
            }
    }
}
