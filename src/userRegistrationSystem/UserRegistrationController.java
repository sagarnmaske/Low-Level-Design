package userRegistrationSystem;

public class UserRegistrationController {
    public void performOperations(){
        Platform platform = new Platform();
        platform.addUser(new User(1,"Sagar",27));
        platform.addUser(new User(2,"Suhani",5));
        platform.addUser(new User(3,"Arni",2));
        platform.increment();
        platform.addUser(new User(4,"Ganesh",14));
        platform.addUser(new User(5,"Yash",17));
        platform.addUser(new User(1,"Sagar",27));
        platform.increment();

    }
}
