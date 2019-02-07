public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {

        EnemyShip enemyShip = null;

        switch (newShipType) {
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            case "B":
                return new BigUfoEnemyShip();

            default:
                return null;
        }
    }
}