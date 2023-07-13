package JAVAOP.units;

public class Monarch extends Wizard {
    public Monarch(String name, int x, int y) {
        super(1, 100, name, "Monarch", 2, 6, 3, x, y);
    }
  
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "HEAL - " + heal + " " + "X - " + place.x + " " + "Y - " + place.y;
    }
}
