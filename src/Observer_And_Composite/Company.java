public interface Company {

    void registe(Observer newObserwer);
    void notifyObserver();
    void unregister(Observer deleteObserwers);
}
