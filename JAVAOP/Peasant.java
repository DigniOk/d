package JAVAOP;

public class Peasant extends BasicHero {
    public Peasant(String name) {
        super(6, 100, name, "Peasant", 1, 3);
    }
    @Override
    public void step(){  
    }
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative;
    }
}
