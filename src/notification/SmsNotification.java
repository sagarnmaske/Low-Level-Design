package notification;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("You got secret with Sms notification");
    }
}
