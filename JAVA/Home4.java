package JAVA;
import java.util.ArrayList;
import java.util.Random;
public class Home4 {
        public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5;i++) {
            list.add(new Random().nextInt(15));
        }
        System.out.println(list);
        int sum = 0;
        int sr = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
             sum = sum + list.get(i);
             sr=sum/5;           
        }
      System.out.println("Cумма = "+sum);
      System.out.println("Среднее арифмитическое = "+sr);  
    }
}
