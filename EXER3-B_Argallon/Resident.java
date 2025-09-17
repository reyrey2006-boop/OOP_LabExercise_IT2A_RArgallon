
class Resident extends User {
    public Resident(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void showHome() {
        System.out.println("Welcome Resident " + name + "! You can submit complaints and react to announcements.");
    }

    public Complaint submitComplaint(String description) {
        Complaint c = new Complaint(description, this);
        System.out.println(name + " submitted a complaint: " + description);
        return c;
    }

    public void reactToAnnouncement(Announcement ann, String reaction) {
        System.out.println(name + " reacted to announcement " + ann.announcementId + " with: " + reaction);
    }
}
