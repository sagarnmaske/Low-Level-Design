package notification;

import java.util.List;

public class NotificationSender {
    List<User> users;
    Notification smsNotification;
    Notification emailNotification;

    public NotificationSender(List<User> users,
                              SmsNotification smsNotification,
                              EmailNotification emailNotification) {
        this.users = users;
        this.smsNotification = smsNotification;
        this.emailNotification = emailNotification;
    }

    public void sendNotification(Event notification) {
        Thread smsThread = new Thread(() -> {
            for (User user : users) {
                smsNotification.notifyUser(user, notification);
            }
        });

        Thread emailThread = new Thread(() -> {
            for (User user : users) {
                emailNotification.notifyUser(user, notification);
            }
        });

        smsThread.start();
        emailThread.start();

    }
}
