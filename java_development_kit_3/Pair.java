package java_development_kit_3;

import java.util.Objects;
import java.util.function.Function;

public class Pair<U, V> {
    private final U first;
    private final V second;
    private final Function<U, String> firstToStr;
    private final Function<V, String> secondToStr;
    public Pair(U first, V second) {
        this(first, second, null, null);
    }
    public Pair(U first, V second, Function<U, String> firstToStr, Function<V, String> secondToStr) {
        this.first = first;
        this.second = second;
        if (firstToStr == null) {
            this.firstToStr = Objects::toString;
        } else {
            this.firstToStr = firstToStr;
        }
        if (secondToStr == null) {
            this.secondToStr = Objects::toString;
        } else {
            this.secondToStr = secondToStr;
        }
    }
    public U getFirst() {
        return first;
    }
    public V getSecond() {
        return second;
    }
    @Override
    public String toString() {
        return String.format("%s{first=%s, second=%s}",
                Pair.class.getSimpleName(),
                getStrRepr(first, firstToStr),
                getStrRepr(second, secondToStr));
    }
    private static <T> String getStrRepr(T obj, Function<? super T, String> toStrRepr) {
        assert toStrRepr != null;
        String repr = toStrRepr.apply(obj);
        if (obj instanceof String) {
            repr = String.format("'%s'", obj);
        }
        return repr;
    }
}