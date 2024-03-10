
import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        System.out.println(read("C:\\Users\\godag\\OneDrive\\Desktop\\story.txt"));

    }

    public static List<String> read(String file) {
        List<String> paragraph = new ArrayList<>();
        Path filePath = Paths.get(file);
        try {
            paragraph = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Error occured while reading" + e.getMessage());
        }
        return paragraph;
    }

}
