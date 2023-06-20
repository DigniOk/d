package Jhome1.java;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class home {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5;i++) {
            list.add(new Random().nextInt(15));
        }
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
           int rem = list.get(i) % 2;
                if (rem == 0) {
                    list.remove(i);
                }
            }
         System.out.println("Список с удаленными четными числами:"  + list);
    }
}
    
}
