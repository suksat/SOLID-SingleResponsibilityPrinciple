package srp;

public class Main {
    public static void main(String[] args) {
        // Instantiate dependencies
        UserRepository userRepository = new InMemoryUserRepository();
        UserService userService = new UserService(userRepository);

        // Create a new user
        String username = "ohn123";
        String password = "password123";
        // here if you change value to Password123 then output will be User created successfully!

        try {
            userService.createUser(username, password);
            System.out.println("User created successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create user: " + e.getMessage());
        }
    }
}

