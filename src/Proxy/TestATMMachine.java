public class TestATMMachine {

    public static void main(String[] args){

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);

       // GetATMData getData = new ATMMachine();
        GetATMData atmProxy = new ATMProxy();

        System.out.println("\n Curren Atm Stae"+atmProxy.getATMData());
        System.out.println("\n Cash in Atm machine "+atmProxy.getCashInMachine());

    }
}