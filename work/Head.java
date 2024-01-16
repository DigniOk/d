package work;

public class Head extends Employee{
    
    public Head(String surName, String name, String midName, String position, String phone, double salary, int age) {
        super(name, midName, surName, position, phone, salary, age);
    }
      /**
       * Статический метод для повышения зарплаты сотрудников, кроме руководителей.
       *
       * @param employees Массив сотрудников
       * @param amount    Сумма повышения
       */
    public static void increaseSalary(Employee[] employees, int amount) {
        for (Employee employee : employees
        ) {
          if (!(employee instanceof Head)) {
            employee.increaseSalary(amount);
          }
        }
    }
    
}
