package notification;

import java.util.List;

public class NotificationManager {
    public EventConsumer initializeEventConsumer(Event event, NotificationSender sender) {
        return new EventConsumer(event, sender);
    }

    public NotificationSender createNotificationSender(List<User> users) {
        return new NotificationSender(users, new SmsNotification(), new EmailNotification());
    }

    public List<User> createUserList() {
        User user1 = new User(1, "Sagar");
        User user2 = new User(2, "Ganesh");
        User user3 = new User(3, "Yash");
        User user4 = new User(4, "suhani");
        User user5 = new User(5, "Arni");
        User user6 = new User(6, "Dada");
        return List.of(user1, user2, user3, user4, user5, user6);
    }
}
