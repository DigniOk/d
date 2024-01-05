package Core;

public class FindNumbers {

    public static int findNumbers(int[] mas) {
        if (mas.length <= 1) {
            return 0;
        }
        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
        }       
    return max-min;
    }
    
}
