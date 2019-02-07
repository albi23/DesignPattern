package Stock;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    ArrayList<Observer> observers;
    private  double ibmPrice;
    private  double aaplerice;
    private  double googlePrice;

    public  StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserwer) {
        observers.add(newObserwer);
    }

    @Override
    public void unregister(Observer deleteObserwers) {
        int obserwerIndex = observers.indexOf(deleteObserwers);
        System.out.println("Stock.Observer" + (obserwerIndex+1)+ " deleted");
        observers.remove(obserwerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob : observers){
            ob.update(ibmPrice,aaplerice,googlePrice);
        }
    }

    public void setAaplePrice(double newAaplePrice){
        this.aaplerice = newAaplePrice;
        notifyObserver();
    }

    public void setGooglePrice(double newGooglePrice){
        this.googlePrice = newGooglePrice;
        notifyObserver();
    }

    public void setIbmPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }
}
