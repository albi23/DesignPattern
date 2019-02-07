public class Test {

    public static void main(String[] args){

        Hoagie customerForHoagie = new ItalianHagie();
        customerForHoagie.makeSandwich();

        Hoagie customer2ForHoagie = new VeggieHogie();
        customer2ForHoagie.makeSandwich();
    }
}
