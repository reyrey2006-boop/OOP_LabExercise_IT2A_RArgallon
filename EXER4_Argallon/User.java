// Abstract parent class
public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    // Runtime polymorphism target
    public abstract void viewRequests();
}
