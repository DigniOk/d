package JAVAOP;

public class Monk extends Wizard{
     public Monk(String name) {
        super(0, 100, name, "Monk", 5, 7, 2);
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
