package srp;

// UserRepository interface for managing user persistence
public interface UserRepository {
    void save(User user);
    void saveUser(User user);
    User getUserByUsername(String username);
}
