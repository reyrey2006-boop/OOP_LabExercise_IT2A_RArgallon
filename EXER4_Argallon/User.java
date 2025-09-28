// Abstract parent class
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    // Runtime polymorphism target
    public void viewRequests();
}

