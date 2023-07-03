package JAVAOP;

public abstract class Shooter extends BasicHero {
    public Shooter(int id, int healthlevel, String name, String type, int atackLevelBase,
     int initiative, int maxDamage, int minDamage, int range, int shots) {
        super(id, healthlevel, name, type, atackLevelBase, initiative);
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.range = range;
        this.shots = shots;
    }
    public int maxDamage;
    public int minDamage;
    public int range;
    public int shots;
}
