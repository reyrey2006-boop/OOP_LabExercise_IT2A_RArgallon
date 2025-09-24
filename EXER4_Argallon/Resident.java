// Resident class - child of User
public class Resident extends User {

    public Resident(String name) {
        super(name);
    }

    // Compile-time polymorphism (method overloading)
    public void submitRequest(String type) {
        System.out.println(name + " submitted a request for: " + type);
    }

    public void submitRequest(String type, String details) {
        System.out.println(name + " submitted a request for: " + type +
                " with details: " + details);
    }

    // Runtime polymorphism (method overriding)
    @Override
    public void viewRequests() {
        System.out.println(name + " is viewing ONLY his/her own requests.");
    }
}
