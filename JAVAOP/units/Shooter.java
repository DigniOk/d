package JAVAOP.units;
import java.util.ArrayList;

public abstract class Shooter extends BasicHero {
    public Shooter(int id, int healthlevel, String name, String type, int atackLevelBase, int x, int y,
     int initiative, int maxDamage, int minDamage, int range, int shots) {
        super(id, healthlevel, name, type, atackLevelBase, initiative, x, y);
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.range = range;
        this.shots = shots;
    }
    public int maxDamage;
    public int minDamage;
    public int range;
    public int shots;

    @Override
    public void step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ours) {
        if (this.healthlevel == 0 || this.shots == 0) return;
        BasicHero temp = findNearEnemy(enemy); 
        temp.healthlevel = temp.healthlevel - this.atackLevelBase;
        for (BasicHero item: ours) {
            if (item.type.contains("Peasant")) return;
        }
        this.shots = this.shots - 1;
    }
}

