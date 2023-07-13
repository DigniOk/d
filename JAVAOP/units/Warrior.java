package JAVAOP.units;

import java.util.ArrayList;

public abstract class Warrior extends BasicHero {
    public Warrior(int id, int healthlevel, String name, String type, int atackLevelBase, int initiative, int x, int y, int maxDamage,  
    int minDamage, int speed) {
        super(id, healthlevel, name, type, atackLevelBase, initiative, x, y);
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.speed = speed;     
        }
    public int maxDamage;
    public int minDamage;
    public int speed;
    @Override
    public void step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ours) {
        if (this.healthlevel == 0) return;
        BasicHero temp = findNearEnemy(enemy); 
        temp.healthlevel = temp.healthlevel - this.atackLevelBase;
        
    }
    
}
    

