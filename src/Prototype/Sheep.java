public class Sheep implements Animal {

    public Sheep(){

        System.out.println("Ship is made");
    }

    @Override
    public Animal makeCopy() {

        System.out.println("Sheep is being made");
        Sheep sheep = null;

        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    public String toString(){
        return  "Doly is my hero, Baaa";
    }
}
