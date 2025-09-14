// Filename: Main.java
public class Main {
    public static void main(String[] args) {
        // object with default constructor
        Announcement a1 = new Announcement();

        // object with values
        Announcement a2 = new Announcement(
            "Water Interruption",
            "No water supply tomorrow from 8AM–5PM due to maintenance.",
            "Barangay Admin",
            "Sept 15, 2025"
        );

        // display default announcement
        System.out.println(a1.getData());

        // update announcement details
        a1.setTitle("Barangay Assembly");
        a1.setMessage("There will be a general assembly this Saturday at 2PM.");
        a1.setAuthor("Barangay Captain");
        a1.setDate("Sept 20, 2025");

        System.out.println("\nAfter update:");
        System.out.println(a1.getData());

        // display second announcement
        System.out.println("\n" + a2.getData());
    }
}
