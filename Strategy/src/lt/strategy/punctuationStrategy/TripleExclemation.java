package lt.strategy.punctuationStrategy;

public class TripleExclemation implements PunctuationStrategy{
    @Override
    public String getPunctuation() {
        return "!!!";
    }
}
