package JAVA.ISK;

public class HOMEISK {
    public static void main(String[] args) {
        int[] intArray = {};
        try {
            intArray = new int[] { 3, 3, 3, 4, 5, 6, 7, 8, 9 };
            int d = 0;
            double catchedRes1 = intArray[8] / 1;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
    

