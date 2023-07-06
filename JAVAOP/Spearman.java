package JAVAOP;

public class Spearman  extends Warrior{
    public Spearman(String name) {
        super(5, 100, name, "Rogue", 4, 2, 5, 3, 2);
    }
    @Override
    public void step(){
    }
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative + " " 
        + "MAXD - " + maxDamage + " " + "MIND - " + minDamage + " " + "SPEED - " + speed;
    }
    
}
