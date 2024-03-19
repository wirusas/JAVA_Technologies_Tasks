package lt.strategy.punctuationStrategy;

public class FullStopPunctuation implements PunctuationStrategy{

    @Override
    public String getPunctuation() {
        return ".";
    }
}
