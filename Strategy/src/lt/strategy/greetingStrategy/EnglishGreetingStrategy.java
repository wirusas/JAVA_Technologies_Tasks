package lt.strategy.greetingStrategy;

public class EnglishGreetingStrategy implements GreeterLanguageStrategy{
    @Override
    public String getGreetingString(String name, String surname, String punctuation) {
        return name + " " + surname + punctuation;
    }
}
