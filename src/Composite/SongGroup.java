import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

    private ArrayList songComponents = new ArrayList();
    private String groupName;
    private String groupescription;

    public SongGroup(String groupName, String groupescription) {

        this.groupescription =groupescription;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupescription() {
        return groupescription;
    }

    public void add(SongComponent newSongComponent){
        songComponents.add(newSongComponent);
    }

    public void remove(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);

    }

    public SongComponent getComponent(int componentIndex){
        return (SongComponent)songComponents.get(componentIndex);
    }

    public void displaySongInfo(){
        System.out.println(groupescription + "  "+
                getGroupName() + " \n");
        Iterator songIterator = songComponents.iterator();

        while (songIterator.hasNext()){
            SongComponent songInfo = (SongComponent)songIterator.next();
            songInfo.displaySongInfo();
        }
    }


}
