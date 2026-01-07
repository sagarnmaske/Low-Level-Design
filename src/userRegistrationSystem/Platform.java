package userRegistrationSystem;

import java.util.HashSet;
import java.util.Set;

public class Platform {
    public Set<User> users;
    public int count;

    public Platform() {
        this.users = new HashSet<>();
        this.count = 0;
    }


    public void addUser(User u) {
        try {
            if(this.users.contains(u)){
                throw new Exception();
            }
            this.users.add(u);
            System.out.println(u);
        } catch (Exception e) {
            System.out.println(u);
            System.out.println("User Already Present");
        }

    }

    public void increment() {
        this.count++;
        System.out.println("Count Incremented");
        notifyAllUsers();
    }

    private void notifyAllUsers() {
        for (User user : this.users) {
            user.receiveNotification(this.count);
        }
    }
}

