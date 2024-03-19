package lt.strategy.punctuationStrategy;

public class SingleExclemation implements PunctuationStrategy{
    @Override
    public String getPunctuation() {
        return "!";
    }
}
