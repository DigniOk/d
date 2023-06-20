package JAVA;
import java.util.Random;
import java.util.ArrayList;
public class Home {

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

