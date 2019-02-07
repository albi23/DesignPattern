package ZadanieTp;

public class PLN100 implements Chain {

    Chain next;

    @Override
    public void withdrawMoney(int request) {
        int temp = request;
        if (request >=0) {
            int i = 0;
            while (temp > 100) {
                i++;
                temp -= 100;
            }
            System.out.println(i + " x 100 PLN");
        }
        next.withdrawMoney(temp);

    }

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }


}
