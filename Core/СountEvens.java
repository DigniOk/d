package Core;

public class СountEvens {
    public static int countEvens(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
          if (mas[i] % 2 == 0) {
            count++;
          }
        }
        return count;
      }
    
}
