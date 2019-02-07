package Animal;

public class Bird extends Animal{

    // The constructor initializes all objects

    public Bird(){

        super();

        setSound("Tweet");

        // We set the Animal.Flys interface polymorphically
        // This sets the behavior as a non-flying Animal.Animal

        flyingType = new ItFlys();

    }

}