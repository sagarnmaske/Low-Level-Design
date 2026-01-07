package userRegistrationSystem;

import java.util.Objects;

public class User {
    public int id;
    public String name;
    public int age;

    public void receiveNotification(int count) {
        System.out.println(this.name + " Received Current Count:" + count);
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof User user) {
            return user.name.equals(this.name) && user.id == this.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.id);
    }

    @Override
    public String toString() {
        return "Id:" + this.id + " Name:" + this.name;
    }
}
