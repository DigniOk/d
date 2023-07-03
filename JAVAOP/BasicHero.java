package JAVAOP;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.util.Stack;
public abstract class BasicHero {
    int id;

    int healthlevel;

    String name;

    String type;

    int atackLevelBase;

    int initiative;

    public BasicHero(int id, int healthlevel, String name, String type, int atackLevelBase, int initiative) {
        this.id = id;
        this.healthlevel = healthlevel;
        this.name = name;
        this.type = type;
        this.atackLevelBase = atackLevelBase;
        this.initiative = initiative;
    }
}