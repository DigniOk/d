package JAVAOP.units;

public class Bowman extends Shooter {
    public Bowman(String name, int x, int y) {
        super(2, 100, name, "Bowman", 3, x, y, 2, 5, 2, 3, 10);
    }

    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "MAXD - " + maxDamage + " " + "MIND - " + minDamage + " " + "Range - " + range + " " + "Shots - " + shots + " " + "X - " + place.x + " " + "Y - " + place.y;
    }
}
    

