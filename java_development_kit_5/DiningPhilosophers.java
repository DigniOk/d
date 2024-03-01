package java_development_kit_5;

import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
  public static void main(String[] args) {
    int numPhilosophers = 5;
    Philosopher[] philosophers = new Philosopher[numPhilosophers];
    Semaphore table = new Semaphore(numPhilosophers - 1);

    for (int i = 0; i < numPhilosophers; i++) {
      philosophers[i] = new Philosopher(i, table);
      new Thread(philosophers[i]).start();
    }
  }
  static class Philosopher implements Runnable {
    private int id;
    private Semaphore table;

    public Philosopher(int id, Semaphore table) {
      this.id = id;
      this.table = table;
    }
    private void think() {
      System.out.println("Философ " + id + " думает");
      try {
        Thread.sleep(1000); // Размышляют 500 миллисекунд
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    private void eat() {
      System.out.println("Философ " + id + " кушает");
      try {
        Thread.sleep(1000); //
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    @Override
    public void run() {
      for (int i = 0; i < 3; i++) {
        think();

        try {
          table.acquire();
          eat();
        } catch (InterruptedException e) {
          e.printStackTrace();
        } finally {
          table.release();
        }
      }
    }
  }
}