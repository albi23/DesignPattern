public abstract class EnemyShip {


    private String name;
    private double amtDamage;

    public void setName(String name) { this.name = name; }
    public void setDamage(double amtDamage) { this.amtDamage = amtDamage; }


    public String getName() { return name; }

    public double getAmtDamage() { return amtDamage; }

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacka and does "+getAmtDamage());

    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen");

    }
}
