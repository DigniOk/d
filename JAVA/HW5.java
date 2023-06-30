package JAVA;

import java.util.HashMap;
import java.util.Iterator;

public class HW5 {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object JW = new Object();

    public static void main(String[] args) {
        addHM(3);
        addHM(9);
        addHM(12);
        addHM(39);
        addHM(44);
        addHM(69);
        addHM(99);
        addHM(0);
        addHM(33);
        addHM(22);
        System.out.println(isEmpty());

        printConsole();
        System.out.println();
        try {
            System.out.println(print_index(6));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addHM(Integer number) {
        hMap.put(number, JW);
    }

    private static boolean isEmpty() {
        return hMap.isEmpty();
    }

    private static void printConsole() {
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    private static int print_index(int index) {
        return (Integer) hMap.keySet().toArray()[index];
    }

}