import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    public HashMap<String, String> abbreviationList = new HashMap<>();

    public Abbreviations() {
    }

    public void addAbbreviation(String abbreviation, String explenation) {
        abbreviationList.put(abbreviation, explenation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        boolean isAbbreviationAdded;
        if (abbreviationList.isEmpty() || !abbreviationList.containsKey(abbreviation)) {
            isAbbreviationAdded = false;
        } else {
            isAbbreviationAdded = true;
        }
        return isAbbreviationAdded;
    }

    public String findExplanationFor(String abbreviation) {
        String explanation = abbreviationList.get(abbreviation);
        return (explanation == null || explanation.isEmpty()) ? null : explanation;
    }

    public void removeAbbreviation(String abbreviation) throws Exception {
        if (abbreviationList.isEmpty()) {
            throw new Exception("List is empty");
        } else {
            abbreviationList.remove(abbreviation);
        }


    }

    @Override
    public String toString() {
        return abbreviationList.toString();
    }
}
