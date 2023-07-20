package JAVAOP;

import java.util.Random;
import java.util.Scanner;

import JAVAOP.units.BasicHero;
import JAVAOP.units.Bowman;
import JAVAOP.units.HammerMonk;
import JAVAOP.units.Monk;
import JAVAOP.units.Names;
import JAVAOP.units.Peasant;
import JAVAOP.units.Rogue;
import JAVAOP.units.Arbalet;
import JAVAOP.units.Spearman;

import java.util.ArrayList;


public class Main {
    private static String getNames() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }
    static ArrayList<BasicHero> light = new ArrayList<>();
    static ArrayList<BasicHero> dark = new ArrayList<>();
    static ArrayList<BasicHero> UnitedTeam = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1; 11 > i; i++) {
            int NewHeroLight = new Random().nextInt(8);
            switch (NewHeroLight) {
                case 0:
                    light.add(new Monk(getNames(), 1, i));
                    break;
                case 1:
                    light.add(new HammerMonk(getNames(), 1, i));
                    break;
                case 2:
                    light.add(new Bowman(getNames(), 1, i));
                    break;
                case 3:
                    light.add(new Arbalet(getNames(), 1, i));
                    break;
                case 4:
                    light.add(new Rogue(getNames(), 1, i));
                    break;
                case 5:
                    light.add(new Spearman(getNames(), 1, i));
                    break;
                case 6:
                    light.add(new Peasant(getNames(), 1, i));
                    break;
                default:
                    light.add(new Monk(getNames(), 1, i));
            }
        }
        for (int i = 1; 11 > i; i++) {
            int NewHeroDark = new Random().nextInt(8);
            switch (NewHeroDark) {
                case 0:
                    dark.add(new Monk(getNames(), 10, i));
                    break;
                case 1:
                    dark.add(new HammerMonk(getNames(), 10, i));
                    break;
                case 2:
                    dark.add(new Bowman(getNames(), 10, i));
                    break;
                case 3:
                    dark.add(new Arbalet(getNames(), 10, i));
                    break;
                case 4:
                    dark.add(new Rogue(getNames(), 10, i));
                    break;
                case 5:
                    dark.add(new Spearman(getNames(), 10, i));
                    break;
                case 6:
                    dark.add(new Peasant(getNames(), 10, i));
                    break;    
                default:
                    dark.add(new Monk(getNames(), 10, i));
            }
        }

        
        UnitedTeam.addAll(light);
        UnitedTeam.addAll(dark);
        UnitedTeam.sort((o1, o2) -> o2.getInitiative()-o1.getInitiative()); 

        Scanner scan = new Scanner(System.in);

        View.view();
        while (true) {
            scan.nextLine();
            for(BasicHero item: UnitedTeam) {
                if (light.contains(item)) {
                    item.step(dark, light);
                } else {
                    item.step(light, dark);
                }        
            } 
            View.view();  
        } 
    }  
}
