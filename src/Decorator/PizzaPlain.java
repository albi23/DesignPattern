package Pizza;

public class PizzaPlain implements Pizza{

    @Override
    public String getDescription() {
        return "Thin Dought";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
