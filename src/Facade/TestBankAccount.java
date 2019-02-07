public class TestBankAccount {

    public static void main(String[] args){

        BankAccountFacade accessingbank = new BankAccountFacade(12345678,1234);

        accessingbank.withdrawCash(50.0);
        accessingbank.withdrawCash(900.0);
        accessingbank.depositCash(200.0);
    }
}
