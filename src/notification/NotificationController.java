package notification;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class NotificationController {
    public static void controlNotification() {
        NotificationManager notificationManager = new NotificationManager();
        EventsQueue e = new EventsQueue();
        YTVideoCreator ytVideoCreator = new YTVideoCreator(123, e);
        DiscountOfferPublisher discountOfferPublisher = new DiscountOfferPublisher(e);
        List<User> users = notificationManager.createUserList();
        NotificationSender notificationSender = notificationManager.createNotificationSender(users);
        EventConsumer eventConsumer = notificationManager.initializeEventConsumer(e, notificationSender);
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            try {
                for (int i = 0; i < 2; i++) {
                    ytVideoCreator.uploadVideo(i);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }).thenRunAsync(() -> {
            try {
                for (int i = 0; i < 2; i++) {
                    discountOfferPublisher.appyDiscountOffer(i);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }).thenRunAsync(() -> {
            try {
                int c = 0;
                while (c < 2) {
                    Thread.sleep(5000);
                    eventConsumer.consumeEvent();
                    c++;
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
        try {
            completableFuture.get();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
