
class Announcement {
    private static int counter = 1;
    int announcementId;
    String content;
    Official createdBy;

    public Announcement(String content, Official createdBy) {
        this.announcementId = counter++;
        this.content = content;
        this.createdBy = createdBy;
    }

    public void displayAnnouncement() {
        System.out.println("Announcement #" + announcementId + " by " + createdBy.name + ": " + content);
    }
}
