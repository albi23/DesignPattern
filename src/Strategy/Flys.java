package Animal;// The interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal.Animal, or Animal.Flys.

// Classes that implement new Animal.Flys interface
// subclasses can allow other classes to use
// that code eliminating code duplication

// I'm decoupling : encapsulating the concept that varies

public interface Flys {
    String fly();

}

// Class used if the Animal.Animal can fly

class ItFlys implements Flys {

    public String fly() {
        return "Flying High";
    }

}

//Class used if the Animal.Animal can't fly

class CantFly implements Flys {

    public String fly() {
        return "I can't fly";
    }

}