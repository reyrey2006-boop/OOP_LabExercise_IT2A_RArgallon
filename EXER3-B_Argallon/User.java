
abstract class User {
    protected String name;
    protected String username;
    protected String password;

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
    public abstract void showHome();
}
