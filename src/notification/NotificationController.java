package notification;

import java.util.List;

public class NotificationController {
    public static void controlNotification() {
        NotificationManager notificationManager = new NotificationManager();
        Event e = new Event();
        Creator creator = new Creator(123, e);
        List<User> users = notificationManager.createUserList();
        NotificationSender notificationSender = notificationManager.createNotificationSender(users);
        EventConsumer eventConsumer = notificationManager.initializeEventConsumer(e, notificationSender);
        Thread videoCreatingThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    creator.uploadVideo(i);
                    Thread.sleep(1000);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        int count = 10;

        Thread eventConsumerThread = new Thread(() -> {
            try {
                int c = 0;
                while (c < count) {
                    eventConsumer.consumeEvent();
                    Thread.sleep(2000);
                    c++;
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        eventConsumerThread.start();
        videoCreatingThread.start();
    }
}
