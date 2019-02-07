public class Robot implements RobotPlan {

    private String robotHead;
    private String robotArms;
    private String robotlLegs;
    private String robotTurso;

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotlLegs() {
        return robotlLegs;
    }

    public String getRobotTurso() {
        return robotTurso;
    }

    @Override
    public void setRobotHead(String head) {
        this.robotHead = head;
    }

    @Override
    public void setRobotTurso(String turso) {
        this.robotTurso = turso;
    }

    @Override
    public void setRobotArms(String arms) {
        this.robotArms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotlLegs = legs;

    }
}
