public class MainApp {
    public static void main(String[] args) {
        // create request objects
        ServiceRequest r1 = new ServiceRequest("Juan Dela Cruz", "Purok 3", "Garbage", "Basura wala gi kolekta");
        ServiceRequest r2 = new ServiceRequest("Maria Santos", "Purok 5", "Lights", "Street light guba");

        // print details
        System.out.println("=== Request 1 ===");
        System.out.println(r1.getData());

        System.out.println("\n=== Request 2 ===");
        System.out.println(r2.getData());

        // update status
        r1.setResolved(true);

        System.out.println("\n=== Request 1 (Updated) ===");
        System.out.println(r1.getData());
    }
}