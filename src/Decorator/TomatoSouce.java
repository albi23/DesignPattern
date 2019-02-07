package Pizza;

public class TomatoSouce  extends ToppingDecorator{
     TomatoSouce(Pizza pizza) {
        super(pizza);
        System.out.println("Adding sauce");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Tomato Sauce ";
    }

    public double getCost(){
        return tempPizza.getCost() +  0.35;
    }
}
