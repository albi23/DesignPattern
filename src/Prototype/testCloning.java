import java.awt.*;

public class testCloning {

    public static void main(String[] args){
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();

        Sheep cloneSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(cloneSheep);

        System.out.println("Saly Hascode: "+System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clone Sheep Hascode: "+System.identityHashCode(System.identityHashCode(cloneSheep)));

    }
}
