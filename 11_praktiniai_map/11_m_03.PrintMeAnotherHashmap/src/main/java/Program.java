
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    public static void printValues(HashMap<String, Book> hashMap){
        for (Book value : hashMap.values()){
            System.out.println(value);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text){
for (Book value : hashMap.values()){
    if(value.getName().contains(text)){
        System.out.println(value);
    }
}

    }
}
