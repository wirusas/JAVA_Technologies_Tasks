package lt.strategy.greetingStrategy;

public class LithuanianGreetingStrategy implements GreeterLanguageStrategy{
    @Override
    public String getGreetingString(String name, String surname, String punctuaion) {
        return name + " " + surname + punctuaion;
    }
}
