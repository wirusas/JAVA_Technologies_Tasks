package lt.techin.stream;


import com.sun.tools.javac.Main;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPraktiniai {

    public static List<Integer> returnSquareRoot(List<Integer> numbers) {

        return numbers.stream()
                .map(number -> (int) Math.sqrt(number)).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> users) {

        return users.stream()
                .map(age -> age.getAge()).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        List<Integer> distinctAge = users.stream()
                .map(age -> age.getAge())
                .distinct()
                .collect(Collectors.toList());
        return distinctAge;
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        Integer counter = (int) users.stream()
                .filter(age -> age.getAge() > 25)
                .count();

        return counter;
    }

    public static List<String> mapToUpperCase(List<String> strings) {

        return strings.stream()
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers) {
        return
                integers.stream()
                        .mapToInt(numb -> numb)
                        .sum();

    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {

        return
                integers.stream()
                        .skip(toSkip)
                        .collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        return
                names.stream()
                        .map(fulName -> fulName.split(" ")[0])
                        .collect(Collectors.toList());

    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream()
                .flatMap(element -> element.chars().mapToObj(ch -> String.valueOf((char) ch)))
                .distinct()
                .collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users) {
        return
                users.stream()
                        .map(user -> user.getName())
                        .collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        double sumOfAges = users.stream()
                .mapToDouble(user -> user.getAge())
                .sum();
        return sumOfAges / users.size();
    }

    public static Integer getMaxAge(List<User> users) {
        OptionalInt maxAge = users.stream()
                .mapToInt(user -> user.getAge())
                .max();
        return maxAge.isPresent() ? maxAge.getAsInt() : null;
    }

    public static Integer getMinAge(List<User> users) {
        OptionalInt minAge = users.stream()
                .mapToInt(user -> user.getAge())
                .min();
        return minAge.isPresent() ? minAge.getAsInt() : null;
    }

    public static boolean anyMatch(List<User> users, int age) {
        return
                users.stream()
                        .anyMatch(user -> user.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream()
                .noneMatch(user -> user.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream()
                .filter(user -> user.getName() == name)
                .findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted((user1, user2) -> user1.getAge() - user2.getAge())
                .collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.iterate(2, numb -> numb + 1)
                .filter(StreamPraktiniai::isPrime)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        Random random = new Random();
        return random.ints(10, 1, Integer.MAX_VALUE)
                .boxed()
                .collect(Collectors.toList());

    }

    public static User findOldest(List<User> users) {

        Optional<User> oldest = users.stream()
                .max((user1, user2) -> user1.getAge() - user2.getAge());
        return oldest.orElse(null);
    }

    public static int sumAge(List<User> users) {
        return users.stream()
                .mapToInt(user -> user.getAge())
                .sum();

    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {

        return
                users.stream()
                        .collect(Collectors.partitioningBy(user -> user.isMale()));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale,
                        Collectors.counting()));
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream()
                .collect(Collectors.summarizingInt(User::getAge));
    }

}
