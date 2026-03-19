package notification;

public class User {
    int id;

    public User(int id) {
        this.id = id;
    }

    public void receiveNotification(Event message) {
        System.out.println("userId:" + id + " Received Event Notification");
        System.out.println(message);
    }
}
