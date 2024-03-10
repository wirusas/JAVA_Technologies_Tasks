
public class Main {

    public static void main(String[] args) throws Exception {
        // Test your program here!

        Abbreviations myAbbreviations = new Abbreviations();
        myAbbreviations.addAbbreviation("a", "Alpha");
        myAbbreviations.addAbbreviation("b", "Bravo");
        myAbbreviations.addAbbreviation("c", "Charlie");
        System.out.println(myAbbreviations);

        System.out.println(myAbbreviations.findExplanationFor("a"));

        System.out.println(myAbbreviations.hasAbbreviation("d"));

        myAbbreviations.removeAbbreviation("a");
        System.out.println(myAbbreviations);
    }

}
