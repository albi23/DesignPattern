package ZadanieTp;

public class TestWithdraw {

    public static void main(String[] args){

        Chain pln100 = new PLN100();
        Chain pln50 = new PLN50();
        Chain pln20 = new PLN20();
        Chain pln10 = new PLN10();

        pln100.setNext(pln50);
        pln50.setNext(pln20);
        pln20.setNext(pln10);

        Klient klient = new Klient(1395);
        Klient klient2 = new Klient(5630);
        Klient klient3 = new Klient(1450);
        Klient klient4 = new Klient(1110);

        pln100.withdrawMoney(klient.getCash());
        pln100.withdrawMoney(klient2.getCash());
        pln100.withdrawMoney(klient3.getCash());
        pln100.withdrawMoney(klient4.getCash());


    }
}
