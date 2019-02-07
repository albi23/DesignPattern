import java.util.Random;

public class EnemyTank implements EnemyAttacker{

    private  Random generator = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10)+1;
        System.out.println("Enemy Tank does "+ attackDamage+ "damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5)+1;
        System.out.println("Enemy tanks moves"+ movement+" spaces");
    }

    @Override
    public void assignDrivers(String driverName) {
        System.out.println(driverName + "is driving tank");
    }
}
