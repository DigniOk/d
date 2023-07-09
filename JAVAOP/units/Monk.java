package JAVAOP.units;

public class Monk extends Wizard{
     public Monk(String name, int x, int y) {
        super(0, 100, name, "Monk", 5, 7, 2, x, y);
    }
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "HEAL - " + heal + " " + "X - " + place.x + " " + "Y - " + place.y;
    }
    
}
