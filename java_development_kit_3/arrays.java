package java_development_kit_3;

import java.util.Objects;

public class arrays {
    public static <E> boolean compareArrays(E[] arrayA, E[] arrayB) {
        if (arrayA == null) {
            throw new NullPointerException("arrayA");
        }
        if (arrayB == null) {
            throw new NullPointerException("arrayB");
        }
        if (arrayA.length != arrayB.length) {
            return false;
        }
        for (int i = 0; i < arrayA.length; ++i) {
            if (!Objects.equals(arrayA[i], arrayB[i])) {
                return false;
            }
        }
        return true;
    }
}
