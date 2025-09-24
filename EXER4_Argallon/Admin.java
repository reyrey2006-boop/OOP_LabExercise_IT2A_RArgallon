// Admin class - child of User
public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    // Runtime polymorphism (method overriding)
    @Override
    public void viewRequests() {
        System.out.println("Admin " + name + " is viewing ALL residents' requests.");
    }
}

