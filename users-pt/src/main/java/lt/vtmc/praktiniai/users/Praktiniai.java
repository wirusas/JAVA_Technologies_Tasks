package lt.vtmc.praktiniai.users;

import java.util.ArrayList;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        return Math.toIntExact(users.stream()
                .filter(age -> age.getAge() > 25)
                .count());

    }

    public static double getAverageAge(List<User> users) {
        double sumOfAges = 0;
        for (User user : users) {
            sumOfAges += user.getAge();
        }
        return sumOfAges / users.size();

    }

    public static Integer getMinAge(List<User> users) {
        if (users.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        users.sort((user1, user2) -> user1.getAge() - user2.getAge());
        return users.get(0).getAge();
    }

    public static User findByName(List<User> users, String name) {
        if (users.isEmpty()) {
            throw new IllegalArgumentException("ther is no such user");
        }
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public static List<User> sortByAge(List<User> users) {

        return users.stream()
                .sorted((user1, user2) -> user1.getAge() - user2.getAge())
                .toList();
    }

    public static User findOldest(List<User> users) {
        return users.stream()
                .max((user1, user2) -> user1.getAge() - user2.getAge())
                .orElse(null);
    }

    public static int sumAge(List<User> users) {
        return users.stream()
                .mapToInt(user -> user.getAge())
                .sum();
    }

}
