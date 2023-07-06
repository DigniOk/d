package JAVAOP;
import java.util.Random; 
import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        BasicHero merlin = new Monk("Merlin");
        BasicHero booba = new Monarch("Booba");
        BasicHero nick = new Bowman("Nick");
        BasicHero lucky = new Sniper("Lucky");
        BasicHero happy = new Rogue("Happy");
        BasicHero longman = new Spearman("LongMan");
        BasicHero zero = new Peasant("Zero");

        // System.out.println(merlin.getInfo());
        // System.out.println();
        // System.out.println(booba.getInfo());
        // System.out.println();
        // System.out.println(nick.getInfo());
        // System.out.println();
        // System.out.println(lucky.getInfo());
        // System.out.println();
        // System.out.println(happy.getInfo());
        // System.out.println();
        // System.out.println(longman.getInfo());
        // System.out.println();
        // System.out.println(zero.getInfo());

        ArrayList<BasicHero> allHeroes = new ArrayList<>();
        allHeroes.add(merlin); allHeroes.add(booba); allHeroes.add(nick); allHeroes.add(lucky);
        allHeroes.add(happy); allHeroes.add(longman); allHeroes.add(zero);

        ArrayList<BasicHero> team1 = new ArrayList<>();
        ArrayList<BasicHero> team2 = new ArrayList<>();
        for (int i = 0; 10 > i;i++) {
            int j = new Random().nextInt(7);
            switch (j) {
                case 0: team1.add(new Monk("Vlad"));
                break;
                case 1: team1.add(new Monarch("Stepa"));
                break;
                case 2: team1.add(new Bowman("Nastya"));
                break;
                case 3: team1.add(new Sniper("Sonya"));
                break;
                case 4: team1.add(new Rogue("Danil"));
                break;
                case 5: team1.add(new Spearman("Anton"));
                break;
                default: team1.add(new Monk("Dima"));
            }
        }
            for (int i = 0; 10 > i;i++) {
            int n = new Random().nextInt(7);
            switch (n) {
                case 0: team2.add(new Monk("Galya"));
                break;
                case 1: team2.add(new Monarch("Valera"));
                break;
                case 2: team2.add(new Bowman("Sasha"));
                break;
                case 3: team2.add(new Sniper("Katya"));
                break;
                case 4: team2.add(new Rogue("Misha"));
                break;
                case 5: team2.add(new Spearman("Dan"));
                break;
                default: team2.add(new Monk("Gleb"));
            
        }
    }
    
            
    
        System.out.println("Команда 1:");
        team1.forEach(j -> System.out.println(j.getInfo()));
        System.out.println("Команда 2:");
        team2.forEach(n -> System.out.println(n.getInfo()));
        }

        
        
}
