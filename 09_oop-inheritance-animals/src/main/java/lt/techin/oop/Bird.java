package lt.techin.oop;

public class Bird extends Animal {


    public Bird() {
        super("blue", 2, false);
    }


    @Override
    public String getDescription() {
String getDescription = super.getDescription();
getDescription = getDescription + " Moreover, it has 2 wings and can fly.";
        return  getDescription;
    }

}

//Override getDescription() method for class Bird: add one more sentence to the description.
// The result must be "This animal is mostly blue. It has 2 paws and no fur. Moreover,
// it has 2 wings and can fly."
