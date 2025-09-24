// Tester class
public class ProjectTester {
    public static void main(String[] args) {
        // Create objects
        Resident r1 = new Resident("Juan Dela Cruz");
        Admin a1 = new Admin("Captain Reyes");

        // --- Compile-time polymorphism demo (overloading) ---
        r1.submitRequest("Clean-up Drive");
        r1.submitRequest("Medical Assistance", "Needs doctor for elderly");

        System.out.println();

        // --- Runtime polymorphism demo (overriding) ---
        User u;

        u = r1;   // parent reference to Resident
        u.viewRequests(); // calls Resident.viewRequests()

        u = a1;   // parent reference to Admin
        u.viewRequests(); // calls Admin.viewRequests()
    }
}
