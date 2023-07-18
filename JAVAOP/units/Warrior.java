package JAVAOP.units;

import java.util.ArrayList;

public abstract class Warrior extends BasicHero {
    public Warrior(int id, int healthlevel, String name, String type, int atackLevelBase, int initiative, int x, int y) {
        super(id, healthlevel, name, type, atackLevelBase, initiative, x, y); 
        }

    @Override
    public void step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ours) {
        if (this.healthlevel == 0) return;
        BasicHero temp = findNearEnemy(enemy); 
        temp.healthlevel = temp.healthlevel - this.atackLevelBase;
        
    }
    @Override
    public String getInfo() {
        return name + " " + type + " " + "HP-" + healthlevel + " " + "ATACK-" + atackLevelBase + " " + "Initiative-" + initiative;
    }
}
    

