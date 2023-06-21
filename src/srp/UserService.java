package srp;

// UserService class responsible for user-related operations
public class UserService {

    private UserRepository userRepository;

    // Constructor injecting UserRepository dependency
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Method to create a new user
    public void createUser(String username, String password) {
        // Validate username and password
        if (isValidUsername(username) && isValidPassword(password)) {
            User user = new User(username, password);
            userRepository.save(user); // Save user to the repository
            sendWelcomeEmail(user); // Send welcome email
        } else {
            throw new IllegalArgumentException("Invalid username or password");
        }
    }

    // Method to validate username
    private boolean isValidUsername(String username) {
        // Check if the username is not null and meets the required criteria
        // Return true if the username is valid
        // Return false if the username is invalid
        return username != null && username.length() >= 5 && username.matches("[a-zA-Z0-9]+");
    }

    // Method to validate password
    private boolean isValidPassword(String password) {
        // Check if the password is not null and meets the required criteria
        if (password != null && password.length() >= 8) {
            // Custom password validation rules
            boolean containsUppercase = !password.equals(password.toLowerCase());
            boolean containsLowercase = !password.equals(password.toUpperCase());
            boolean containsDigit = password.matches(".*\\d.*");

            // Check if the password satisfies all the rules
            // Return true if the password is valid
            return containsUppercase && containsLowercase && containsDigit;
        }

        // Return false if the password is invalid
        return false;
    }


    // Method to send a welcome email to the user
    private void sendWelcomeEmail(User user) {
        String emailContent = "Dear " + user.getUsername() + ",\n"
                + "Welcome to our application! We're excited to have you on board.\n"
                + "If you have any questions, feel free to reach out to our support team.\n"
                + "Thank you!\n"
                + "Best regards,\n"
                + "Your Application Team";

        // Code to send the email goes here
        // Replace the placeholder code with the actual implementation of sending an email
        // You can use JavaMail or any other email library for sending emails
    }

}

