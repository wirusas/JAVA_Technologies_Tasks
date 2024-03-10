package lt.users.users.services;

import lt.users.users.model.User;
import lt.users.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public List<User> getUserById(Long id) {
        return userRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public User deleteUser(Long id) {
        User userToDelete = (User) getUserById(id);
        if (userToDelete != null) {
            userRepository.delete(userToDelete);
        }
        return userToDelete;
    }

    @Override
    public User updateUser(Long id, User newUser) {
        User existingUser = (User) getUserById(id);
        if (existingUser != null) {
            existingUser.setUsername(newUser.getUsername());
            existingUser.setFirstName(newUser.getFirstName());
            existingUser.setLastName(newUser.getLastName());
            existingUser.setEmail(newUser.getEmail());
            return userRepository.save(existingUser);
        }
        return null;
    }
}

