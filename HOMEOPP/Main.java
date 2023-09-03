package HOMEOPP;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        store.addToy(1, "Car", 10, 15);
        store.addToy(2, "Barbie", 5, 10);
        store.addToy(3, "Soldier", 20, 50);
        store.addToy(4, "SuperMan", 15, 25);

        store.play();

        try {
            store.getPrizeToy();
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }

    }    
    
}
