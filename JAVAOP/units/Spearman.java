package JAVAOP.units;

public class Spearman  extends Warrior{
    public Spearman(String name, int x, int y) {
        super(5, 100, name, "Rogue", 4, 4, x,  y, 2, 1, 1);
    }
 
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "MAXD - " + maxDamage + " " + "MIND - " + minDamage + " " + "SPEED - " + speed + " " + "X - " + place.x + " " + "Y - " + place.y;
    }
    
}
