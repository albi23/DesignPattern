public class VeggieHogie extends Hoagie{

    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    boolean customerWantsMeat(){return  false;}
    boolean customerWantsChees(){return  false;}



    @Override
    void addMeat() { }

    @Override
    void addChees() { }

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
