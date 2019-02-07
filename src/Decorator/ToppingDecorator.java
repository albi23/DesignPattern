package Pizza;

public abstract class ToppingDecorator implements  Pizza{

    protected Pizza tempPizza;

    ToppingDecorator(Pizza pizza){
        this.tempPizza = pizza;
    }

    public String getDescription(){
        return tempPizza.getDescription();
    }

    public double getCost(){
        return tempPizza.getCost();
    }

}
