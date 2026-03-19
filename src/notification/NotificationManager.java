package notification;

import java.util.List;

public class NotificationManager {
    public EventConsumer initializeEventConsumer(EventsQueue eventsQueue, NotificationSender sender) {
        return new EventConsumer(eventsQueue, sender);
    }

    public NotificationSender createNotificationSender(List<User> users) {
        return new NotificationSender(users, new SmsNotification(), new EmailNotification());
    }

    public List<User> createUserList() {
        User user1 = new User(1);
        // User user2 = new User(2);
        return List.of(user1);
    }
}
