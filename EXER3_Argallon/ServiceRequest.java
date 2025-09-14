public class ServiceRequest {
    // attributes (private para encapsulation)
    private String requesterName;
    private String address;
    private String type;
    private String description;
    private boolean resolved;

    // constructor
    public ServiceRequest(String requesterName, String address, String type, String description) {
        this.requesterName = requesterName;
        this.address = address;
        this.type = type;
        this.description = description;
        this.resolved = false; // default: pending pa
    }

    // getters ug setters
    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    // method to show request details
    public String getData() {
        String status = resolved ? "Resolved" : "Pending";
        return "Requester: " + requesterName +
               "\nAddress: " + address +
               "\nType: " + type +
               "\nDescription: " + description +
               "\nStatus: " + status;
    }
}