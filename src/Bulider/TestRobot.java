public class TestRobot {
    public static void main(String[] args){

        RobotBulider robotBulider = new OldRobotBulider();
        RobotEngineer robotEngineer = new RobotEngineer(robotBulider);
        robotEngineer.makeRobot();
        Robot ourRobot = robotEngineer.getRobot();

        System.out.println(ourRobot.getRobotArms());
        System.out.println(ourRobot.getRobotlLegs());
        System.out.println(ourRobot.getRobotHead());
        System.out.println(ourRobot.getRobotTurso());
    }
}
