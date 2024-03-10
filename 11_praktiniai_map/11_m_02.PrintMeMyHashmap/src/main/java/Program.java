import java.util.HashMap;
import java.util.Map;

public class Program {
    HashMap<String, String> hashMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        printKeys(new HashMap<>());


        // Test your program here!
    }

    public static void printKeys(HashMap<String, String> hashMap) throws Exception {
        hashMap.put("1", "pirmas");
        hashMap.put("2", "antras");
        hashMap.put("3", "trecias");
        if (hashMap.isEmpty()) {
            throw new Exception("List is empty");
        } else {
            for (String key : hashMap.keySet()) {
                System.out.println(key);
            }
        }

    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text) throws Exception {
        if (hashMap.isEmpty()) {
            throw new Exception("List is empty");
        }

        for (HashMap.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) throws Exception{
        if (hashMap.isEmpty()) System.out.println("List is empty");
        for (Map.Entry<String, String> text1 : hashMap.entrySet()){
            if(text1.getKey().contains(text)){
                System.out.println(text1.getValue());
            }
        }
    }

}
