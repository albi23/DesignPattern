public class OldRobotBulider implements RobotBulider{

    private Robot robot;

    public OldRobotBulider(){
        this.robot= new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Thin head");
    }

    @Override
    public void buildRobotArm() {
        robot.setRobotArms("Tin Arms");
    }

    @Override
    public void buildRobotTurso() {
        robot.setRobotTurso("Tin Turos");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Tin Legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }

}
