package lt.strategy.greetingStrategy;

import lt.strategy.punctuationStrategy.Punctuation;

public class Greeting {
    GreeterLanguageStrategy greeterLanguageStrategy;

    public Greeting(GreeterLanguageStrategy greeterLanguageStrategy) {
        this.greeterLanguageStrategy = greeterLanguageStrategy;
    }
    public String greet(String firstName, String lastName, String punctuaion){
        return greeterLanguageStrategy.getGreetingString(firstName, lastName, punctuaion);
    }
}
