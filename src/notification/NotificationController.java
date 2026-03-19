package notification;

import java.util.List;

public class NotificationController {
    public static void controlNotification() {
        NotificationManager notificationManager = new NotificationManager();
        EventsQueue e = new EventsQueue();
        YTVideoCreator YTVideoCreator = new YTVideoCreator(123, e);
        DiscountOfferPublisher discountOfferPublisher = new DiscountOfferPublisher(e);
        List<User> users = notificationManager.createUserList();
        NotificationSender notificationSender = notificationManager.createNotificationSender(users);
        EventConsumer eventConsumer = notificationManager.initializeEventConsumer(e, notificationSender);
        Thread videoCreatingThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    YTVideoCreator.uploadVideo(i);
                    Thread.sleep(1000);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        Thread discountOfferThread = new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    discountOfferPublisher.appyDiscountOffer(i);
                    Thread.sleep(1000);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        int count = 2;

        Thread eventConsumerThread = new Thread(() -> {
            try {
                int c = 0;
                while (c < count) {
                    eventConsumer.consumeEvent();
                    Thread.sleep(10000);
                    c++;
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
        discountOfferThread.start();
        videoCreatingThread.start();
        eventConsumerThread.start();
    }
}
