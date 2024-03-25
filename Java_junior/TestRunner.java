package Java_junior;

import Java_junior.Annotation.AfterAll;
import Java_junior.Annotation.AfterEach;
import Java_junior.Annotation.BeforeAll;
import Java_junior.Annotation.BeforeEach;
import Java_junior.Annotation.Test;

import java.lang.reflect.AccessFlag;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TestRunner {
    public static void run(Class<?> testClass) {
        final Object testObj = initTestObj(testClass);
        beforeAll(testClass, testObj);
        test(testClass, testObj, setMethodsPriority(testClass));
        afterAll(testClass, testObj);
    }


    private static Object initTestObj(Class<?> testClass) {
        try {
            Constructor<?> noArgsConstructor = testClass.getConstructor();
            return noArgsConstructor.newInstance();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Нет конструктора по умолчанию");
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Не удалось создать объект тест класса");
        }
    }


    private static void beforeAll(Class<?> testClass, Object testObj) {
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.getAnnotation(BeforeAll.class) != null) {
                try {
                    method.invoke(testObj);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void beforeEach(Class<?> testClass, Object testObj) {
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.getAnnotation(BeforeEach.class) != null) {
                try {
                    method.invoke(testObj);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static List<Method> setMethodsPriority(Class<?> testClass) {
        final List<Method> methods = new ArrayList<>();
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.accessFlags().contains(AccessFlag.PRIVATE)) {
                continue;
            }
            if (method.getAnnotation(Test.class) != null) {
                methods.add(method);
            }
        }
        methods.sort(Comparator.comparingInt(o -> o.getAnnotation(Test.class).order()));
        return methods;
    }

    private static void test(Class<?> testClass, Object testObj, List<Method> methods) {
        for (Method method : methods) {

            try {
                beforeEach(testClass, testObj);
                method.invoke(testObj);
                afterEach(testClass, testObj);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void afterEach(Class<?> testClass, Object testObj) {
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.getAnnotation(AfterEach.class) != null) {
                try {
                    method.invoke(testObj);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void afterAll(Class<?> testClass, Object testObj) {
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.getAnnotation(AfterAll.class) != null) {
                try {
                    method.invoke(testObj);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    
}
