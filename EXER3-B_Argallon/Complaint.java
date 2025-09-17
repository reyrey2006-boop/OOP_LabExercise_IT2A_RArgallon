
class Complaint {
    private static int counter = 1;
    int complaintId;
    String description;
    String status;
    Resident submittedBy;

    public Complaint(String description, Resident submittedBy) {
        this.complaintId = counter++;
        this.description = description;
        this.status = "Pending";
        this.submittedBy = submittedBy;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void displayComplaint() {
        System.out.println("Complaint #" + complaintId + ": " + description + " | Status: " + status + " | By: " + submittedBy.name);
    }
}
