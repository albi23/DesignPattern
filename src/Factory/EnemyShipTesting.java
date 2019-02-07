import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args){

        EnemyShip theEnemy = null;
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption= "";
        System.out.println("What type of ship (U / R / B)");

        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(enemyShipOption);

        }

        doStuffEnemy(theEnemy);

    }

    public static  void  doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
