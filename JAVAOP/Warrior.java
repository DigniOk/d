package JAVAOP;

public abstract class Warrior extends BasicHero {
    public Warrior(int id, int healthlevel, String name, String type, int atackLevelBase, int initiative, int maxDamage, 
    int minDamage, int speed) {
        super(id, healthlevel, name, type, atackLevelBase, initiative);
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.speed = speed;     
        }
    public int maxDamage;
    public int minDamage;
    public int speed;
}
    

