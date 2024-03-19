package lt.strategy.punctuationStrategy;

public class Punctuation {
    PunctuationStrategy punctuationStrategy;

    public Punctuation(PunctuationStrategy punctuationStrategy) {
        this.punctuationStrategy = punctuationStrategy;
    }
    public String getPunctuation(){
        return punctuationStrategy.getPunctuation();
    }
}
