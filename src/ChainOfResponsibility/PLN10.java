package ZadanieTp;

public class PLN10 implements Chain {

    Chain next;

    @Override
    public void withdrawMoney(int request) {
        int temp = request;
        if (request >= 10 ) {
            int i = 0;
            while (temp >= 10 ) {
                i++;
                temp -= 10;
            }
            System.out.println(i+" x 10 PLN");
        }
        System.out.println("Transaction finished. \n\n");
    }

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }


}
