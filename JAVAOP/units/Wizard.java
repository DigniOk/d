package JAVAOP.units;

import java.util.ArrayList;

public abstract class Wizard extends BasicHero {
    public Wizard(int id, int healthlevel, String name, String type, int atackLevelBase, int initiative, int heal, int x, int y) {
        super(id, healthlevel, name, type, atackLevelBase, initiative, x , y);
        this.heal = heal;
    }
    public int heal;

    @Override
    public void step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ours) {
        if (this.healthlevel > 0 ) {
            for (BasicHero item: ours) {
                if (item.healthlevel < 99) {
                    item.healthlevel=item.healthlevel + this.heal;
                    return;
                }            
            }
            BasicHero temp = findNearEnemy(enemy); 
            temp.healthlevel = temp.healthlevel - this.atackLevelBase;     
        }
    } 
    @Override
    public String getInfo() {
        return name + " " + type + " " + "HP-" + healthlevel + " " + "ATACK-" + atackLevelBase + " " + "Initiative-" + initiative + " " + "HEAL-" + heal;
    }
}
