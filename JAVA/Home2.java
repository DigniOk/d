package JAVA;
import java.util.ArrayList;
import java.util.Random;

public class Home2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5;i++) {
            list.add(new Random().nextInt(15));
        }
        System.out.println(list);
        int max = list.get(0);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > max) {
               max = list.get(i);
            }
        }
      System.out.println("Максимальное значениe = "+max);  
    }
}

