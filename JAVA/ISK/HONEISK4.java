package JAVA.ISK;

import java.util.Scanner;

public class HONEISK4 {
    public static void main(String[] args) {
        
         try {
            System.out.println(print());
         } catch (Exception e) {
            System.out.println("Ошибка, введите дробное число");
            System.out.println(print());  
         }
        
    }
    public static float print() {
       Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        float a = iScanner.nextFloat();
        return a;
    }
    
}
