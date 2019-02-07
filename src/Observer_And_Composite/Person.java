public class Person extends Organisation implements Observer {


    private static int ObserverIDTracker = 0;
    private int ObserverID;

    public Person() {
        this.ObserverID = ++ObserverIDTracker;
        System.out.println("New observer "+ObserverID);

    }

    @Override
    public void update(double fb,double microsoft){
        this.priceFacebook = fb;
        this.priceMicrosoft = microsoft;
        printNewPrices();

    }

    void printNewPrices(){
        System.out.println(ObserverID +"\nMicrosoft : "+priceMicrosoft+"\n" +
                "FaceBook : "+priceFacebook+"\n");
    }
}
