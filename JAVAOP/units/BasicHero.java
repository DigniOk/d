package JAVAOP.units;
import java.util.ArrayList;


public abstract class BasicHero implements InGameInterface {
    int id;

    float healthlevel;

    String name;

    String type;

    int atackLevelBase;

    int initiative;

    protected Cordinats place;

    public BasicHero(int id, float healthlevel, String name, String type, int atackLevelBase, int initiative, int x, int y) {
        this.id = id;
        this.healthlevel = healthlevel;
        this.name = name;
        this.type = type;
        this.atackLevelBase = atackLevelBase;
        this.initiative = initiative;
        place = new Cordinats(x, y);
    }
    protected int[] findNearEnemy (ArrayList<BasicHero> enemy) {
        double min = 1000;
        int count = 0;
        for (int i = 0; i < enemy.size(); i++) {
            if (place.calcDistance(enemy.get(i).place) < min){
                min = place.calcDistance(enemy.get(i).place);
                count = i;
            }
        }
        return new int[] {(int) Math.round(min), count};
    }
}