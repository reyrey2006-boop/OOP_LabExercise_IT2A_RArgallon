// Filename: Announcement.java
public class Announcement {
    // attributes (private)
    private String title;
    private String message;
    private String author;
    private String date;

    // constructor with parameters
    public Announcement(String title, String message, String author, String date) {
        this.title = title;
        this.message = message;
        this.author = author;
        this.date = date;
    }

    // default constructor
    public Announcement() {
        this.title = "No Title";
        this.message = "No Message";
        this.author = "Unknown";
        this.date = "Not Set";
    }

    // getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    // method to display announcement details
    public String getData() {
        return "--- Barangay Announcement ---\n"
             + "Title: " + title + "\n"
             + "Message: " + message + "\n"
             + "Author: " + author + "\n"
             + "Date: " + date;
    }
}
