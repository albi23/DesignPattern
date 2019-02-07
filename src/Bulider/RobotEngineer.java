public class RobotEngineer {

    private  RobotBulider robotBulider;

    public RobotEngineer(RobotBulider robotBulider){
        this.robotBulider = robotBulider;
    }

    public Robot getRobot(){
        return this.robotBulider.getRobot();
    }

    public void makeRobot(){
        this.robotBulider.buildRobotHead();
        this.robotBulider.buildRobotArm();
        this.robotBulider.buildRobotLegs();
        this.robotBulider.buildRobotTurso();
    }
}
