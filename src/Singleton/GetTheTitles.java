import java.util.LinkedList;

public class GetTheTitles implements Runnable{

    public void run(){

        Singleton newInstance = Singleton.getFirstinstance();
        System.out.println("Instance ID "+System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String>  playersOneTitles = newInstance.getTitles(7);

        System.out.println("Player : "+ playersOneTitles);
        System.out.println("Got Tiles");

    }

}
