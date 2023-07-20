package JAVAOP.units;

import java.util.ArrayList;

public abstract class Warrior extends BasicHero {
    public Warrior(int id, int healthlevel, String name, String type, int atackLevelBase, int initiative, int x, int y) {
        super(id, healthlevel, name, type, atackLevelBase, initiative, x, y); 
        }

        @Override
        public void step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ours) {
            if (this.healthlevel <= 0)
                return;
            BasicHero temp = findNearEnemy(enemy);
            if (this.place.calcDistance(temp.place) < 2) {
                temp.getDamage(this.atackLevelBase);
                return;
            }

            Cordinats tp = new Cordinats(place.x, place.y);
            if (Math.abs(this.place.x - temp.place.x) > Math.abs(this.place.y - temp.place.y)) {
                if (this.place.x < temp.place.x) {
                    tp.x = tp.x + 1;                    
                } else {
                    tp.x = tp.x - 1;
                }
            } else {
                if (this.place.y < temp.place.y) {
                    tp.y = tp.y + 1;
                } else {
                    tp.y= tp.y - 1;
                }

            }
            boolean flag = false;
            for (BasicHero item : ours) {
                if (item.place.x == tp.x & item.place.y == tp.y & item.healthlevel > 0) {
                    flag = true;
                    
                }
            }
            if (flag) {
                return;
            }
            this.place.x = tp.x;
            this.place.y = tp.y;

        }
            
        
    
    @Override
    public String getInfo() {
        return name + " " + type + " " + "HP-" + healthlevel + " " + "ATACK-" + atackLevelBase + " " + "Initiative-" + initiative;
    }
}
    

