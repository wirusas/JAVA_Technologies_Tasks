package lt.users.users.controller;
import lt.users.users.model.User;
import lt.users.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return (User) userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User newUser) {
        return userService.updateUser(id, newUser);
    }
}
