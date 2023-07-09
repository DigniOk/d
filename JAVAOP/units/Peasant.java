package JAVAOP.units;

import java.util.ArrayList;

public class Peasant extends BasicHero {
    public Peasant(String name, int x, int y) {
        super(6, 100, name, "Peasant", 1, 3, x , y);
    }
    @Override
    public void step(ArrayList<BasicHero> enemy) {
        int[] temp = findNearEnemy(enemy); 
        System.out.println("LN - " + temp[0] + " " + "EnemyName - " + enemy.get(temp[1]).name);
    }
    @Override
    public String getInfo() {
        return "NAME - " + name + " " + "TYPE - " + type + " " + "ID - " + id + " " + 
        "HEALTH - " + healthlevel + " " + "ATACK - " + atackLevelBase + " " + "Initiative - " + initiative +
         " " + "X - " + place.x + " " + "Y - " + place.y;
    }
}
