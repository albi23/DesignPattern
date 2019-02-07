import java.util.ArrayList;
import java.util.Iterator;

public class CompanyOne implements Company {

    private ArrayList observers;
    private double priceMicrosoft;
    private double priceFacebook;

    public CompanyOne(){
        observers = new ArrayList();
    }


    @Override
    public void registe(Observer newObserwer) {
        observers.add(newObserwer);
    }


    @Override
    public void notifyObserver() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){

            Observer obw = (Observer)iterator.next();
            obw.update(priceFacebook,priceMicrosoft);
        }
    }

    @Override
    public void unregister(Observer deleteObserwers) {
        observers.remove(deleteObserwers);
    }

    public void setPriceMicrosoft(double priceMicrosoft) {
        this.priceMicrosoft = priceMicrosoft;
        notifyObserver();
    }

    public void setPriceFacebook(double priceFacebook) {
        this.priceFacebook = priceFacebook;
        notifyObserver();
    }
}
