package JAVA;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class HW {
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
        String a = iScanner.nextLine();
        if (a.equals("q")) {
            System.exit(0);
        } else {
            humans.sort(new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                }
            });
            for (String[] i : humans) {
                System.out.printf("%s %s.%s. %s %s\n", i[0], i[1].toUpperCase().charAt(0),
                        i[2].toUpperCase().charAt(0), i[3], i[4]);
            }
        }

    }
}
// Krapivin Nikita Sergeevich 27 Male
// Larionov Dmitrii Valerevich 28 Male
// Pirogov Mihail Ivanovich 25 Male

