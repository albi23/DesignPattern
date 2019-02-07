package Animal;

public class Animal {

    private String name;
    private String sound;
    private String favFood;
    private double height;
    private double speed;
    private int weight;


    public Flys flyingType;

    public void setName(String newName){ name = newName; }
    public String getName(){ return name; }

    public void setHeight(double newHeight){ height = newHeight; }
    public double getHeight(){ return height; }

    public void setWeight(int newWeight){
        if (newWeight > 0){
            weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }
    public double getWeight(){ return weight; }

    public void setFavFood(String newFavFood){ favFood = newFavFood; }
    public String getFavFood(){ return favFood; }

    public void setSpeed(double newSpeed){ speed = newSpeed; }
    public double getSpeed(){ return speed; }

    public void setSound(String newSound){ sound = newSound; }
    public String getSound(){ return sound; }

	/* BAD
	* You don't want to add methods to the super class.
	* You need to separate what is different between subclasses
	* and the super class
	public void fly(){

		System.out.println("I'm flying");

	}
	*/

    // Animal.Animal pushes off the responsibility for flying to flyingType

    public String tryToFly(){

        return flyingType.fly();

    }

    // If you want to be able to change the flyingType dynamically
    // add the following method

    public void setFlyingAbility(Flys newFlyType){

        flyingType = newFlyType;

    }

}