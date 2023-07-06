package JAVAOP;

public class Sniper extends Shooter {
    public Sniper(String name) {
        super(3, 100, name, "Sniper", 6, 4, 8, 5, 4, 15);
    }
    @Override
    public void step(){
    }
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "MAXD - " + maxDamage + " " + "MIND - " + minDamage + " " + "Range - " + range + " " + "Shots - " + shots;
    }
}
    
