
class Official extends User {
    public Official(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void showHome() {
        System.out.println("Welcome Official " + name + "! You can manage complaints and announcements.");
    }

    public void makeAnnouncement(String content) {
        System.out.println("Official " + name + " posted announcement: " + content);
    }

    public void updateComplaint(Complaint complaint, String newStatus) {
        complaint.updateStatus(newStatus);
        System.out.println("Official " + name + " updated complaint status to: " + newStatus);
    }
}
