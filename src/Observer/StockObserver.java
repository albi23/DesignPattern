package Stock;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplePrice;
    private double googlePrice;
    private Subject stockGrabber;
    private static int ObserverIDTracker = 0;
    private int ObserverID;

     StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.ObserverID = ++ObserverIDTracker;
        System.out.println("New Stock.Observer " + this.ObserverID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPriece, double aaplePrice, double googlePrice) {
        this.ibmPrice = ibmPriece;
        this.aaplePrice = aaplePrice;
        this.googlePrice = googlePrice;

        printThePrices();
    }

    public void printThePrices(){
        System.out.println(ObserverID + " \nIBM "+ ibmPrice+
                " \nAAPL: "+aaplePrice + "\nGooG: "+googlePrice +"\n ");
    }
}
