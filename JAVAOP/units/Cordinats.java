package JAVAOP.units;

public class Cordinats {
     public Cordinats(int x, int y) {
           this.x = x;
           this.y = y;
     }
public double calcDistance (Cordinats point) {
      int dx = point.x - x;
      int dy = point.y - y;
      return Math.sqrt((dx*dx) + (dy*dy));

}
     int x;
     int y;
}