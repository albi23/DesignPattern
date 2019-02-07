package ZadanieTp;

public class PLN50 implements Chain {

    private Chain next;

    @Override
    public void withdrawMoney(int request) {
        int temp = request;
        if (request >= 50) {
            int i = 0;
            while (temp >= 50) {
                i++;
                temp -= 50;
            }
            System.out.println(i+" x 50 PLN");
        }
            next.withdrawMoney(temp);

    }

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }


}
