package Stock;

public class GrabStock {

    public static void main(String[] main){

        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(196.00);
        stockGrabber.setAaplePrice(655.00);
        stockGrabber.setGooglePrice(222.11);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(196.00);
        stockGrabber.setAaplePrice(655.00);
        stockGrabber.setGooglePrice(222.11);

        stockGrabber.unregister(observer1);
        stockGrabber.setIbmPrice(196.00);
        stockGrabber.setAaplePrice(655.00);
        stockGrabber.setGooglePrice(222.11);

        Runnable getIbm = new GetTheStock(stockGrabber,2,"IBM",197.00);
        Runnable getGOOG = new GetTheStock(stockGrabber,2,"GOOG",222.11);
        Runnable getAAPL = new GetTheStock(stockGrabber,2,"AAPL",655.00);

        new Thread(getIbm).start();
        new Thread(getGOOG).start();
        new Thread(getAAPL).start();
    }
}
