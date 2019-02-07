public class FoundCheck {

    private double cashInAccount = 1000.0;

    public double getCashInAccount(){return  cashInAccount;}

    public  void decreaseCachInaccount(double cashWithdrawn){
     cashInAccount -= cashWithdrawn;
    }

    public  void increaseCachInaccount(double cashDeposited){
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughtMoney( double cashWithdrawn){
        if(getCashInAccount() < cashWithdrawn){
            System.out.println("Error: You don't have enought money");
            System.out.println("Current balance: "+getCashInAccount());
            return  false;
        }
        else{
            decreaseCachInaccount(cashWithdrawn);
            System.out.println("Withdrawal Complete : Currenr Balance is: " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit (double cashToDeposit){
        increaseCachInaccount(cashToDeposit);
        System.out.println("Deposit Complete : Current balance is "+getCashInAccount());
    }

}
