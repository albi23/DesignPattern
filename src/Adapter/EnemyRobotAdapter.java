public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot theRobot) {
        this.theRobot = theRobot;
    }


    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDrivers(String driverName) {
        theRobot.reactToHuman(driverName);
    }
}
