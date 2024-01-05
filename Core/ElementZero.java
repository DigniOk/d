package Core;

public class ElementZero {
    public static boolean elementZero(int[] mas) {
        if (mas.length < 2) {
          return false;
        }
    
        for (int i = 0; i < mas.length - 1; i++) {
          if (mas[i] == 0 && mas[i + 1] == 0) {
    
            return true;
          }
        }
    
        return false;
      }
    
}
