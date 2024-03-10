import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

    public void add(String word, String translation) throws Exception {
        ArrayList<String> translations = dictionary.getOrDefault(word, new ArrayList<>());
        translations.add(translation);
        dictionary.put(word, translations);
    }

    public ArrayList<String> translate(String word) {

        return dictionary.getOrDefault(word, new ArrayList<>());

    }

    public  void remove(String word) throws Exception{
//        if (!dictionary.containsKey(word)){ throw new Exception("Word / Translation is not found");}

        dictionary.remove(word);
    }
}
