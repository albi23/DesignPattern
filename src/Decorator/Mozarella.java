package Pizza;

public class Mozarella extends ToppingDecorator{

    Mozarella(Pizza pizza) {
        super(pizza);
        System.out.println("Adding dought");
        System.out.println("Adding moz");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Pizza.Mozarella ";
    }

    public double getCost(){
        return tempPizza.getCost() +  0.50;
    }
}
