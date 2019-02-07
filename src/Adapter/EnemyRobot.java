import java.util.Random;

public class EnemyRobot {
    private Random generator = new Random();

    public void smashWithHands(){
        int attackDamage = generator.nextInt(10)+1;
        System.out.println("Enemy robot causes "+ attackDamage+" damage with its hands");
    }

    public void walkForward(){
        int movement = generator.nextInt(5)+1;
        System.out.println("Enemy robot walk forwards  moves"+ movement+" spaces");

    }
    public void reactToHuman(String driverNames){
        System.out.println("Enemy robots tramps on "+driverNames);
    }
}
