package Java_junior;

public class Asserter {
    public static void assertEquals(int actual,int expected) {
        if (actual != expected) {
            throw new RuntimeException();
        }
    }
}
