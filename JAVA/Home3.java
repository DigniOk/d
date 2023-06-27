package JAVA;
import java.util.ArrayList;
import java.util.Random;

public class Home3 {
  
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5;i++) {
            list.add(new Random().nextInt(15));
        }
        System.out.println(list);
        int min = list.get(0);
        for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i) < min) {
                    min = list.get(i);
             }

        }

      System.out.println("Минимальное значениe = "+min);  
    }
}

