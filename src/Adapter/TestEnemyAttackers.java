public class TestEnemyAttackers {
    public static void main(String[] args){
        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyRobotAdapter enemyRobotAdapter = new EnemyRobotAdapter(robot);

        System.out.println("Enemy robot_adapter");
        enemyRobotAdapter.assignDrivers("Robo");
        enemyRobotAdapter.driveForward();
        enemyRobotAdapter.fireWeapon();

        System.out.println("Tank");
        tank.assignDrivers("Tank");
        tank.driveForward();
        tank.fireWeapon();

        System.out.println("Only robot");
        robot.reactToHuman("R75F");
        robot.walkForward();
        robot.smashWithHands();
    }
}
