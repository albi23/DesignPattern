package ZadanieTp;

public class PLN20 implements Chain {

    Chain next;

    @Override
    public void withdrawMoney(int request) {
        int temp = request;
        if (request >= 20 ) {
            int i = 0;
            while (temp >= 20) {
                i++;
                temp -= 20;
            }
            System.out.println(i + " x 20 PLN");
        }
        next.withdrawMoney(temp);

    }

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }


}
