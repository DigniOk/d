package JAVAOP;


public abstract class BasicHero implements InGameInterface {
    int id;

    float healthlevel;

    String name;

    String type;

    int atackLevelBase;

    int initiative;

    public BasicHero(int id, float healthlevel, String name, String type, int atackLevelBase, int initiative) {
        this.id = id;
        this.healthlevel = healthlevel;
        this.name = name;
        this.type = type;
        this.atackLevelBase = atackLevelBase;
        this.initiative = initiative;
    }
}