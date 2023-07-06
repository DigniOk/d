package JAVAOP;

public class Rogue extends Warrior {
    public Rogue(String name) {
        super(4, 100, name, "Rogue", 3, 1, 4, 2,5);
    }
    @Override
    public void step(){
    }
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "MAXD - " + maxDamage + " " + "MIND - " + minDamage + " " + "SPEED - " + speed;
    }
}
