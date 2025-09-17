public class CSRS_Main {
    public static void main(String[] args) {
        // Create Official and Resident
        Official official = new Official("Kap. Reyes", "kapreyes", "12345");
        Resident resident = new Resident("Juan Dela Cruz", "juanDC", "67890");

        // Login and show home
        official.login();
        official.showHome();

        resident.login();
        resident.showHome();

        // Resident submits complaint
        Complaint comp1 = resident.submitComplaint("Street light not working.");

        // Official updates complaint
        official.updateComplaint(comp1, "In Progress");

        // Official makes announcement
        Announcement ann1 = new Announcement("Community clean-up drive this Saturday!", official);
        ann1.displayAnnouncement();

        // Resident reacts to announcement
        resident.reactToAnnouncement(ann1, "Will join!");
    }
}
