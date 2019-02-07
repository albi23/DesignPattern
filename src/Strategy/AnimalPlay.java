package Animal;

public class AnimalPlay{

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Animal.Dog: " + sparky.tryToFly());

        System.out.println("Animal.Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType

        sparky.setFlyingAbility(new ItFlys());

        System.out.println("Animal.Dog: " + sparky.tryToFly());

    }

}