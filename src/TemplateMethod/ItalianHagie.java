public class ItalianHagie extends Hoagie{

    String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
    String[] cheeseUsed = { "Provolone" };
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    @Override
    void addMeat() {
        System.out.println("Adding  the Meat: ");
        helpFor(meatUsed);
    }

    @Override
    void addChees() {
        System.out.println("Adding  the Chease: ");
        helpFor(cheeseUsed);
    }

    @Override
    void addVegetables() {
        System.out.println("Adding  the Vegetables: ");
        helpFor(veggiesUsed);
    }

    @Override
    void addVCondiments() {
        System.out.println("Adding  the Condiments: ");
        helpFor(condimentsUsed);
    }

    void helpFor( String[] name){
        for(String meat : name){
            System.out.print(meat + ", ");
        }
    }
}
