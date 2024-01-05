package Core;
import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        int[] mas1 = {2, 1, 2, 3, 4};
        int[] mas2 = {2, 2, 0, 0};
        int[] mas3 = {1, 3, 5};
    
        System.out.println("Количество чётных элементов в mas1 ="+" "+СountEvens.countEvens(mas1));
        System.out.println("Количество чётных элементов в mas2 ="+" "+СountEvens.countEvens(mas2));
        System.out.println("Количество чётных элементов в mas3 ="+" "+СountEvens.countEvens(mas3));

        System.out.println();

        System.out.println("Разница между мин. и макс. в mas1 ="+" "+FindNumbers.findNumbers(mas1));
        System.out.println("Разница между мин. и макс. в mas2 ="+" "+FindNumbers.findNumbers(mas2));
        System.out.println("Разница между мин. и макс. в mas3 ="+" "+FindNumbers.findNumbers(mas3));

        System.out.println();

        System.out.println("Соседние элементы нули в mas1 ="+" "+ElementZero.elementZero(mas1));
        System.out.println("Соседние элементы нули в mas2 ="+" "+ElementZero.elementZero(mas2));
        System.out.println("Соседние элементы нули в mas3 ="+" "+ElementZero.elementZero(mas3));


    }

    
}

