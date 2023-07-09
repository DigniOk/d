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
    public void step(ArrayList<BasicHero> enemy) {
        int[] temp = findNearEnemy(enemy); 
        System.out.println("LN - " + temp[0] + " " + "EnemyName - " + enemy.get(temp[1]).name);
    }
}
