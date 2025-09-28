
public class User {
    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    // Common method for all users
    public void login() {
        System.out.println(name + " logged in successfully!");
    }

    // Abstract method 
    public void showHome();
}

