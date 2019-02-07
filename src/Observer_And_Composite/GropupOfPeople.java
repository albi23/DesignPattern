import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GropupOfPeople extends Organisation implements Observer {

    private static int ObserverIDTracker = 0;
    private int GroupID;
    private ArrayList group = new ArrayList();
    Map<Integer,ArrayList> map;

    public GropupOfPeople() {
        this.GroupID = ++ObserverIDTracker;
        System.out.println("New group observer "+ GroupID);
    }

    public void add(Organisation organisation){
      map = new HashMap<>();
      map.put(GroupID,group);
      group.add(organisation);
    }

    public Observer getGroup() {
        return this;
    }

    @Override
    public void update(double fb,double microsoft){
        this.priceFacebook = fb;
        this.priceMicrosoft = microsoft;
        printNewPrices();

    }

    void printNewPrices(){
        System.out.println("Group: "+ GroupID);

        for (int i = 0 ;i < group.size() ; i++){
        System.out.println("Person "+(i+1)+ " \nMicrosoft : "+priceMicrosoft+"\n" +
                "FaceBook : "+priceFacebook+"\n");}
    }
}
