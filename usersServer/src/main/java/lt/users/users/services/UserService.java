package lt.users.users.services;

import lt.users.users.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User createUser(User newUser);

    List<User> getUserById(Long id);

    User deleteUser(Long id);

    User updateUser(Long id, User newUser);

}
