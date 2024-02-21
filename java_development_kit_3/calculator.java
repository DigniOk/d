package java_development_kit_3;

public class calculator {
    public static <U extends Number, V extends Number> Number sum(U a, V b) {
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue() + b.intValue();
            }
            @Override
            public long longValue() {
                return a.longValue() + b.longValue();
            }
            @Override
            public float floatValue() {
                return a.floatValue() + b.floatValue();
            }
            @Override
            public double doubleValue() {
                return a.doubleValue() + b.doubleValue();
            }
        };
    }
    public static <U extends Number, V extends Number> Number subtract(U a, V b) {
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue() - b.intValue();
            }
            @Override
            public long longValue() {
                return a.longValue() - b.longValue();
            }
            @Override
            public float floatValue() {
                return a.floatValue() - b.floatValue();
            }
            @Override
            public double doubleValue() {
                return a.doubleValue() - b.doubleValue();
            }
        };
    }
    public static <U extends Number, V extends Number> Number multiply(U a, V b) {
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue() * b.intValue();
            }
            @Override
            public long longValue() {
                return a.longValue() * b.longValue();
            }
            @Override
            public float floatValue() {
                return a.floatValue() * b.floatValue();
            }
            @Override
            public double doubleValue() {
                return a.doubleValue() * b.doubleValue();
            }
        };
    }
    public static <U extends Number, V extends Number> Number divide(U a, V b) {
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue() / b.intValue();
            }
            @Override
            public long longValue() {
                return a.longValue() / b.longValue();
            }
            @Override
            public float floatValue() {
                return a.floatValue() / b.floatValue();
            }
            @Override
            public double doubleValue() {
                return a.doubleValue() / b.doubleValue();
            }
        };
    }
}
    

