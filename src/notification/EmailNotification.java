package notification;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("You got secret notification via Email");
    }
}
