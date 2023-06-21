package srp;

// User class representing a user entity
// The Single Responsibility Principle states that a class should have only one reason to change,
// meaning that a class should have a single responsibility or purpose.
// In other words, a class should encapsulate a single behavior or concept.

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // ideally if we add following to this class, then class becomes SRP compliant: -

    /*

    public boolean isValid() {
        return isValidUsername() && isValidPassword();
    }

    private boolean isValidUsername() {
        return username != null && username.length() >= 5 && username.matches("[a-zA-Z0-9]+");
    }

    private boolean isValidPassword() {
        return password != null && password.length() >= 8;
    }

    // Other methods related to user behavior
    // ...

     */
}

