package JAVAOP.units;

public class Sniper extends Shooter {
    public Sniper(String name, int x, int y) {
        super(3, 100, name, "Sniper", 6, x, y, 5, 4, 15, 6, 5);
    }
  
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "MAXD - " + maxDamage + " " + "MIND - " + minDamage + " " + "Range - " + range + " " + "Shots - " + shots 
        + " " + "X - " + place.x + " " + "Y - " + place.y;
    }
}
    
