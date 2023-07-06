package JAVAOP;

public class Bowman extends Shooter {
    public Bowman(String name) {
        super(2, 100, name, "Bowman", 3, 5, 4, 2, 3, 10);
    }

    @Override
    public void step() {
    };

    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "MAXD - " + maxDamage + " " + "MIND - " + minDamage + " " + "Range - " + range + " " + "Shots - " + shots;
    }
}
    

