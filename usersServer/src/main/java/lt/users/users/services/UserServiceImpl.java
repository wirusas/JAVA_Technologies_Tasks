package lt.users.users.services;

import lt.users.users.model.User;
import lt.users.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.*;
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
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User userToDelete = userOptional.get();
            userRepository.delete(userToDelete);
            return userToDelete;
        }
        return null;
    }

    @Override
    public User updateUser(Long id, User newUser) {
        Optional<User> optionalExistingUser = userRepository.findById(id);
        if (optionalExistingUser.isPresent()) {
            User existingUser = optionalExistingUser.get();
            existingUser.setUsername(newUser.getUsername());
            existingUser.setFirstName(newUser.getFirstName());
            existingUser.setLastName(newUser.getLastName());
            existingUser.setEmail(newUser.getEmail());
            return userRepository.save(existingUser);
        }
        return null;
    }
}

