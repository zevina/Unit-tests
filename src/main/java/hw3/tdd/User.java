package hw3.tdd;

public class User {

    String name;
    String password;
    boolean isAuthenticate = false;
    boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public void authenticate(String name, String password) {
        if (name.equals(this.name) && password.equals(this.password)) {
            this.isAuthenticate = true;
        }
    }

}