package lt.strategy;

import lt.strategy.greetingStrategy.EnglishGreetingStrategy;
import lt.strategy.greetingStrategy.Greeting;
import lt.strategy.greetingStrategy.LithuanianGreetingStrategy;
import lt.strategy.punctuationStrategy.FullStopPunctuation;
import lt.strategy.punctuationStrategy.Punctuation;
import lt.strategy.punctuationStrategy.SingleExclemation;
import lt.strategy.punctuationStrategy.TripleExclemation;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting(new LithuanianGreetingStrategy());
        Punctuation fullStop = new Punctuation(new FullStopPunctuation());
        Punctuation singleExclamation = new Punctuation(new SingleExclemation());
        Punctuation tripleExclamation = new Punctuation(new TripleExclemation());


        System.out.println(greeting.greet("Jona", "Jonaitis", fullStop.getPunctuation()));
        greeting = new Greeting(new EnglishGreetingStrategy());
        System.out.println(greeting.greet("John", "Jonathon", singleExclamation.getPunctuation()));
        System.out.println(greeting.greet("Alpha", "Beta", tripleExclamation.getPunctuation()));
    }
}
