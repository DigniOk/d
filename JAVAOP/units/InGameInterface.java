package JAVAOP.units;
import java.util.ArrayList;
public interface InGameInterface {
    void step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ours);
    String getInfo();   
}
