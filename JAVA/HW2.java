package JAVA;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;


public class HW2 {
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String[]> humans = new ArrayList<>();
        System.out.println("Введите данные в формате ФИО, возраст, пол");
        while (true) {
            String a = iScanner.nextLine();
            if (a.equals("q"))
                break;
            humans.add(a.split(" "));
        }
        for (String[] i : humans) {
            System.out.printf("%s %s.%s. %s %s\n", i[0], i[1].toUpperCase().charAt(0),
                    i[2].toUpperCase().charAt(0), i[3], i[4]);
        }
        ArrayList<String> Surname = new ArrayList<>();
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<String> LastName = new ArrayList<>();
        ArrayList<Integer> Age = new ArrayList<>();
        ArrayList<Boolean> Gender = new ArrayList<>();
        for (String[] i : humans) {
            Surname.add(i[0]);
            Name.add(i[1]);
            LastName.add(i[2]);
            Age.add(Integer.parseInt(i[3]));
            Gender.add(i[4].contains("Male"));            
        }
        for (int i = 0; i < Age.size(); i++) {
            for (int j = i; j < Age.size() - 1; j++) {
                if (Age.get(j) < Age.get(j+1)) {
                    
                }
            }

        }
        
    }
    
}

