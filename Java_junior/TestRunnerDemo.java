package Java_junior;

import Java_junior.Annotation.AfterAll;
import Java_junior.Annotation.AfterEach;
import Java_junior.Annotation.BeforeAll;
import Java_junior.Annotation.BeforeEach;
import Java_junior.Annotation.Test;

public class TestRunnerDemo {
    public static void main(String[] args) {
        TestRunner.run(TestRunnerDemo.class);
    }
    @Test(order = 1)
    public void test1() {
        System.out.println("test1");
    }
    @Test(order = 2)
    public void test2() {
        System.out.println("test2");
    }
    @Test(order = 3)
    public void test3() {
        System.out.println("test3");
    }
    @AfterAll
    public void afterAll() {
        System.out.println("После всех методов(afterAll)");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("После метода(AfterEach)");
    }
    @BeforeAll
    public void beforeAll() {
        System.out.println("Перед всеми методами(BeforeAll)");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("Перед методом(BeforeEach)");
    }
    
}
