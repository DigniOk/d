package JAVAOP.units;

import java.util.ArrayList;

public class Peasant extends BasicHero {
    public Peasant(String name, int x, int y) {
        super(6, 100, name, "Peasant", 1, 1, x , y);
    }
    @Override
    public void step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ours) {
        if (this.healthlevel == 0) return;
        BasicHero temp = findNearEnemy(enemy); 
        temp.healthlevel = temp.healthlevel - this.atackLevelBase;  
    
    }
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative +
         " " + "X - " + place.x + " " + "Y - " + place.y;
    }
}
