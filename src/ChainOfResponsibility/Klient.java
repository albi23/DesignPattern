package ZadanieTp;

public class Klient {

    private int cash = 0;

    public Klient(int cash) {
        if (cash % 10 == 0) {
            this.cash = cash;
        } else {
            System.out.println("You must enter amount divide by 10");
        }
    }

    public int getCash() {
        return cash;
    }


}
