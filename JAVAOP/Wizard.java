package JAVAOP;

public abstract class Wizard extends BasicHero {
    public Wizard(int id, int healthlevel, String name, String type, int atackLevelBase, int initiative, int heal) {
        super(id, healthlevel, name, type, atackLevelBase, initiative);
        this.heal = heal;
    }
    public int heal;
}
