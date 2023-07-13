package JAVAOP.units;

public class Rogue extends Warrior {
    public Rogue(String name, int x, int y) {
        super(4, 100, name, "Rogue", 3, 5, x, y, 5, 3, 4);
    }
   
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "MAXD - " + maxDamage + " " + "MIND - " + minDamage + " " + "SPEED - " + speed + " " + "X - " + place.x + " " + "Y - " + place.y;
    }
}
