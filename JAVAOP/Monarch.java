package JAVAOP;

public class Monarch extends Wizard {
    public Monarch(String name) {
        super(1, 100, name, "Monarch", 4, 6, 3);
    }
    @Override
    public void step(){        
    }
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "HEAL - " + heal;
    }
}
