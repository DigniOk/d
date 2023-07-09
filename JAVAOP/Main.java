package JAVAOP;

import java.util.Random;

import JAVAOP.units.BasicHero;
import JAVAOP.units.Bowman;
import JAVAOP.units.Monarch;
import JAVAOP.units.Monk;
import JAVAOP.units.Names;
import JAVAOP.units.Rogue;
import JAVAOP.units.Sniper;
import JAVAOP.units.Spearman;

import java.util.ArrayList;

public class Main {
    private static String getNames() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

    public static void main(String[] args) {
        ArrayList<BasicHero> light = new ArrayList<>();
        ArrayList<BasicHero> dark = new ArrayList<>();
        for (int i = 0; 10 > i; i++) {
            int NewHeroLight = new Random().nextInt(7);
            int y = new Random().nextInt(50);
            switch (NewHeroLight) {
                case 0:
                    light.add(new Monk(getNames(), 0, y));
                    break;
                case 1:
                    light.add(new Monarch(getNames(), 0, y));
                    break;
                case 2:
                    light.add(new Bowman(getNames(), 0, y));
                    break;
                case 3:
                    light.add(new Sniper(getNames(), 0, y));
                    break;
                case 4:
                    light.add(new Rogue(getNames(), 0, y));
                    break;
                case 5:
                    light.add(new Spearman(getNames(), 0, y));
                    break;
                default:
                    light.add(new Monk(getNames(), 0, y));
            }
        }
        for (int i = 0; 10 > i; i++) {
            int NewHeroDark = new Random().nextInt(7);
            int y = new Random().nextInt(50);
            switch (NewHeroDark) {
                case 0:
                    dark.add(new Monk(getNames(), 9, y));
                    break;
                case 1:
                    dark.add(new Monarch(getNames(), 9, y));
                    break;
                case 2:
                    dark.add(new Bowman(getNames(), 9, y));
                    break;
                case 3:
                    dark.add(new Sniper(getNames(), 9, y));
                    break;
                case 4:
                    dark.add(new Rogue(getNames(), 9, y));
                    break;
                case 5:
                    dark.add(new Spearman(getNames(), 9, y));
                    break;
                default:
                    dark.add(new Monk(getNames(), 9, y));
            }
        }
        System.out.println("Команда Light:");
        light.forEach(NewHeroLight -> System.out.println(NewHeroLight.getInfo()));
        System.out.println("Команда Dark:");
        dark.forEach(NewHeroDark -> System.out.println(NewHeroDark.getInfo()));
        System.out.println("Light enemy ");
        light.forEach(n->n.step(dark));
        System.out.println("Dark enemy ");
        dark.forEach(n->n.step(light));
    }
}
