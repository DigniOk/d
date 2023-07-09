package JAVAOP.units;

import java.util.ArrayList;

public abstract class Wizard extends BasicHero {
    public Wizard(int id, int healthlevel, String name, String type, int atackLevelBase, int initiative, int heal, int x, int y) {
        super(id, healthlevel, name, type, atackLevelBase, initiative, x , y);
        this.heal = heal;
    }
    public int heal;

    @Override
    public void step(ArrayList<BasicHero> enemy) {
        int[] temp = findNearEnemy(enemy); 
        System.out.println("LN - " + temp[0] + " " + "EnemyName - " + enemy.get(temp[1]).name);
    }
}
