package Pizza;

public class PizzaMaker {
    public static void main(String[] args){

        Pizza basicPizza = new TomatoSouce(new Mozarella(new PizzaPlain()));
        System.out.println("Indegrediens: "+ basicPizza.getDescription());
        System.out.println("Indegrediens: "+ basicPizza.getCost());
    }
}
