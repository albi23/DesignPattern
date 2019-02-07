public class BankAccountFacade {
    private int accountNumber;
    private int secureNumber;

    AccountNumberCheck accChecker;
    SecurityCodeCheck codeChecker;
    FoundCheck foundCheck;
    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAccNumber, int newSecCode) {
        accountNumber = newAccNumber;
        secureNumber = newSecCode;

        bankWelcome = new WelcomeToBank();
        accChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        foundCheck = new FoundCheck();
    }

    public int getAccountNumber(){return  accountNumber;}
    public int getSecureCode(){return  secureNumber;}

    public void withdrawCash(double cashToGet){

        if (accChecker.accountActive(getAccountNumber()) && codeChecker.isSecurityCodeCorrect(getSecureCode())
        && foundCheck.haveEnoughtMoney(cashToGet)){
            System.out.println("Transaction complete \n");
        }else {
            System.out.println("Transaction Failed \n");
        }

    }

    public void depositCash(double cashTodeposit){
        if (accChecker.accountActive(getAccountNumber()) && codeChecker.isSecurityCodeCorrect(getSecureCode())){
            foundCheck.makeDeposit(cashTodeposit);
            System.out.println("Transaction complete \n");
        }


    }
}
