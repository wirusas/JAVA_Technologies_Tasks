
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        System.out.println(readBooks("nauja knyga, 1962, 200, Jonas Jonaitis"));

    }

    public static List<Book> readBooks(String file) {
        List<Book> listOfBooks = new ArrayList<>();
        Path filePath = Paths.get(file);

        try {

            Files.lines(filePath).forEach(line -> {

                String[] bookParts = line.split(",");

                String title = bookParts[0];
                int year = Integer.parseInt(bookParts[1]);
                int pages = Integer.parseInt(bookParts[2]);
                String author = bookParts[3];

                listOfBooks.add(new Book(title, year, pages, author));
            });
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        return listOfBooks;
    }


}
