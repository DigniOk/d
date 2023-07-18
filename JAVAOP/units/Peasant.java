package JAVAOP.units;

import java.util.ArrayList;

public class Peasant extends BasicHero {
    public Peasant(String name, int x, int y) {
        super(6, 100, name, "Peasant", 1, 1, x , y);
    }
    public boolean busy = false;

    @Override
    public void step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ours) {
        if (this.healthlevel == 0) this.busy = false;
         
    
    }
    @Override
    public String getInfo() {
        return name + " " + type + " " + "HP-" + healthlevel + " " + "ATACK-" + atackLevelBase + " " + "Initiative-" + initiative;
    }

}
